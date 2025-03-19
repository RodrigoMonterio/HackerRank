# HackerRank C++ Challenges Repository

## Descrição

Este repositório contém soluções para desafios do HackerRank utilizando a linguagem C++. Os desafios estão organizados em diferentes pacotes para facilitar a navegação e a compreensão dos conceitos abordados.

## Estrutura do Repositório

O repositório está estruturado da seguinte forma:

```
HackerRank/
├── C++/
│   ├── HackerRank-Cpp/
│   │   ├── Introduction/
│   │   ├── Strings/
│   │   ├── Classes/
│   │   ├── STL/
│   │   ├── Inheritance/
│   │   ├── Debugging/
│   │   ├── Other Concepts/
│   │   ├── README.md
```

### Pacotes e Conteúdos

- **Introduction**: Conceitos básicos e primeiros passos com C++.
- **Strings**: Manipulação e operações com strings em C++.
- **Classes**: Implementação e uso de classes e objetos.
- **STL**: Uso da Standard Template Library (STL) para resolver problemas.
- **Inheritance**: Implementação de herança e polimorfismo em C++.
- **Debugging**: Técnicas e ferramentas para depuração de código.
- **Other Concepts**: Outros conceitos avançados e padrões de projeto.

## Como Usar

1. Clone o repositório:
```sh
   git clone https://github.com/seu-usuario/HackerRank.git
```
2. Navegue até o diretório desejado:
```sh
   cd HackerRank/C++/HackerRank-Cpp/Introduction
```
3. Compile e execute um arquivo C++:
```sh
   g++ nome_do_arquivo.cpp -o output
   ./output
```

## Processo de Inicialização

Você pode iniciar o projeto manualmente seguindo os passos acima ou automatizar o processo com um script. Um exemplo de script de setup pode ser criado para compilar e executar os desafios automaticamente.

Exemplo de script:
```sh
   #!/bin/bash
   
   if [ -z "$1" ]; then
       echo "Uso: ./run.sh <nome_do_arquivo>"
       exit 1
   fi
   
   g++ $1 -o output
   ./output
```

Para usar o script:
```sh
   chmod +x run.sh
   ./run.sh Introduction/exemplo.cpp
```

## Contribuição

Contribuições são bem-vindas! Para sugerir melhorias ou adicionar soluções, abra um pull request ou envie uma issue.

## Licença

Este projeto está sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.


