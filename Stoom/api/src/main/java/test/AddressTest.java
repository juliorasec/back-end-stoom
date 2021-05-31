package test;

import com.example.stoom.api.ApiApplication;
import com.example.stoom.api.controller.AddressController;
import com.example.stoom.api.model.Address;
import com.example.stoom.api.repository.AddressRepository;
import com.example.stoom.api.service.AddressService;
import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= {Address.class, AddressRepository.class})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootTest
public class AddressTest {

    @Autowired
    private AddressRepository repository;

    @Test
    public void createAddress() {
        Address address = new Address(
                1L,
                "rua1",
                "12",
                "casa",
                "bairro",
                "cidade",
                "estado",
                "país",
                "cep",
                "latidude",
                "longitude"
                );
        this.repository.save(address);
        assertThat(address.getId()).isNotNull();
        assertThat(address.getStreetName()).isNotNull();
        assertThat(address.getNumber()).isNotNull();
        assertThat(address.getNeighbourhood()).isNotNull();
        assertThat(address.getCity()).isNotNull();
        assertThat(address.getState()).isNotNull();
        assertThat(address.getCountry()).isNotNull();
        assertThat(address.getZipcode()).isNotNull();
        assertThat(address.getId()).isEqualTo(1L);
        assertThat(address.getStreetName()).isEqualTo("rua1");
        assertThat(address.getNumber()).isEqualTo("12");
        assertThat(address.getNeighbourhood()).isEqualTo("bairro");
        assertThat(address.getCity()).isEqualTo("cidade");
        assertThat(address.getState()).isEqualTo("estado");
        assertThat(address.getCountry()).isEqualTo("país");
        assertThat(address.getZipcode()).isEqualTo("cep");
        assertThat(address.getLatitude()).isEqualTo("latitude");
        assertThat(address.getLongitude()).isEqualTo("longitude");
    }

    @Test
    public void deleteAddress() {
        Address address = new Address(
                1L,
                "rua1",
                "12",
                "casa",
                "bairro",
                "cidade",
                "estado",
                "país",
                "cep",
                "latidude",
                "longitude"
        );
        this.repository.save(address);
        this.repository.delete(address);
        assertThat(this.repository.findById(address.getId())).isNull();
    }

    @Test
    public void updateAddress() {
        Address address = new Address(
                1L,
                "rua1",
                "12",
                "casa",
                "bairro",
                "cidade",
                "estado",
                "país",
                "cep",
                "latidude",
                "longitude"
        );
        this.repository.save(address);
        address.setStreetName("rua2");
        address.setNumber("23");
        address = this.repository.save(address);
        assertThat(address.getStreetName()).isEqualTo("rua2");
        assertThat(address.getNumber()).isEqualTo("23");
    }

}
