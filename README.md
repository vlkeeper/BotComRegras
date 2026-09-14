# BotComRegras - Pará Livros

Este é um assistente virtual baseado em texto desenvolvido em Java para a biblioteca Pará Livros. O chatbot interage com o usuário por meio do terminal, reconhecendo palavras-chave para fornecer informações sobre o acervo, horários de funcionamento, localização, multas e políticas de doação. Ele também demonstra o uso de variáveis de estado (contexto da conversa) para simular o processo de reserva de livros.

## Funcionalidades

* Múltiplas regras de negócio: Respostas mapeadas com base na identificação de palavras-chave.
* Normalização de entrada: Tratamento de strings (conversão para letras minúsculas e remoção de espaços) para facilitar o reconhecimento dos comandos.
* Regras compostas: Combinação de múltiplas condições lógicas (ex: perguntas específicas sobre formatos como quadrinhos ou mangás).
* Controle de Estado/Contexto: Retenção de contexto para a ação de reserva, alterando o fluxo do loop para aguardar o nome do livro na próxima mensagem do usuário.
* Resposta de Fallback: Tratamento padrão para mensagens ou comandos não compreendidos pelo assistente.
* Suporte a UTF-8: Configuração forçada de entrada e saída em UTF-8 para garantir a exibição correta da acentuação no terminal.

## Como Executar

### Pré-requisitos
Java Development Kit (JDK) instalado no seu sistema.

### Passos para execução
* Salve o código fonte do chatbot em um arquivo com o nome exato de App.java.
* Abra o terminal (Prompt de Comando, PowerShell ou terminal do seu sistema operacional) e navegue até o diretório onde o arquivo App.java foi salvo.
* Compile o código informando o encoding UTF-8 com o seguinte comando:
### Terminal
javac -encoding UTF-8 App.java
Após a compilação, um arquivo App.class será gerado na mesma pasta. Execute o programa forçando o formato UTF-8 na máquina virtual Java:
### Terminal
java -Dfile.encoding=UTF-8 App
O console iniciará o chat. Digite suas mensagens para interagir com o assistente.
* Para encerrar o programa, digite sair, tchau ou encerrar.
