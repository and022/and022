🔍 Scanner de Rede em Java
Este projeto é um simples scanner de rede desenvolvido em Java, que permite ao usuário verificar quais dispositivos estão acessíveis em uma sub-rede local (LAN).

📌 Objetivo
Verificar quais endereços IP em uma sub-rede estão ativos e acessíveis, utilizando a função isReachable() da biblioteca InetAddress.

🚀 Como funciona
O programa solicita ao usuário que insira o início do IP da sub-rede (ex: 192.168.0.).

Ele realiza um loop de verificação dos endereços IPs de 192.168.0.1 até 192.168.0.254.

Para cada IP, ele tenta verificar se o dispositivo está acessível (ping) com um tempo limite de 1 segundo.

Se o IP responder, ele é considerado acessível e será exibido no console.

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
