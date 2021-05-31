# back-end-stoom
## OBS:
Necessitei de ajuda para subir o código no github, pois a máquina que utilizo(Macbook) estava encontrando erro através do git ao subir o mesmo, então 
precisei subi-lo em outra máquina.
erro : ("error: RPC failed; curl 55 SSL_write() returned SYSCALL, errno = 32
fatal: The remote end hung up unexpectedly")

## :information_source: Como Utilizar: 

Clonar o projeto, e iniciar aplicacao, precisando [Git](https://git-scm.com). linhas de comando:

```bash
# Clone do repositório
$ git clone https://github.com/juliorasec/back-end-stoom.git

# Entre neste repositório
$ cd back-end-stoom

```


## Rotas

<blockquote>baseUrl: http://localhost:8080</blockquote>

## Address

<p>
  Listar todos os Address (GET)
  
   <code>
    baseUrl/api/address
  </code>
</p>

<p>
  Mostra único Address (GET)
  
   <code>
    baseUrl/api/address/:id
  </code>

</p>

<p>
  Criar Address (POST)
  
  <code>
    baseUrl/api/address/save
  </code>
</p>

<p>
  Atualizar Address (PUT)
  
  <code>
    baseUrl/api/address/:id
  </code>
</p>

<p>
  Deletar Address (DELETE)
  
  <code>
    baseUrl/api/address/:id
  </code>
</p>
