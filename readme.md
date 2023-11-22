# Produzir e consumir mensagens em filas do Rabbit MQ

## Projeto simples com dois apps em spring boot que usam fila do Rabbit MQ para produzir e consumir mensagens enviadas via http rest.

## Rodar o comando `docker-compose up -d --build` no diretório raiz do app produtor para subir o container do rabbitmq.

### Post da mensagem no app Postman

![post da mensagem](./images/post-message.png)

### Mensagem enviada para o RabbitMQ e consumida pelo app consumer

![post da mensagem](./images/print-message.png)

### Arquivo dockerfile com imagem do Rabbit MQ

![post da mensagem](./images/docker.png)

### Arquivo de configuração Rabbit MQ

![post da mensagem](./images/rabbitmq-config.png)

### Escrevendo na fila

![post da mensagem](./images/rest-producer.png)

### Escutando na fila e print na mensagem

![post da mensagem](./images/queue-consumer.png)
