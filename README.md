# Consumir API da Câmara dos Deputados

> Este programa em Java consome a API de dados da 
> Câmara dos Deputados do Brasil, disponível em [https://dadosabertos.camara.leg.br/swagger/api.html](https://dadosabertos.camara.leg.br/swagger/api.html).

---
## Funcionamento do Programa

O programa faz requisições HTTP para a API da Câmara dos Deputados e obtêm os dados.

Utiliza a biblioteca Jackson para desserializar os dados da API, que são retornados em formato JSON.

A desserialização dos dados é feita diretamente nos records, utilizando as anotações `@JsonAlias` para mapear os campos
do JSON para os campos do record.

---
## API da Câmara dos Deputados

A API da Câmara dos Deputados fornece acesso a uma variedade de dados, incluindo informações sobre deputados, partidos,
despesas, eventos, entre outros.

Para mais detalhes, consulte a documentação oficial da API: https://dadosabertos.camara.leg.br/swagger/api.html.

---
## Licença

O Programa é licenciado sob a [MIT License](LICENSE).