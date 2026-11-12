# Jogo da velha em Java Swing

Jogo local para duas pessoas, com interface gráfica construída em Swing. O tabuleiro alterna entre X e O e verifica vitória ou empate após as jogadas.

## Funcionalidades

- Tabuleiro com nove botões.
- Alternância entre os jogadores.
- Bloqueio de casas já preenchidas.
- Mensagem de resultado e reinício do tabuleiro.

## Executar

Requer um JDK e ambiente gráfico disponível.

```bash
javac -encoding UTF-8 -d out src/application/Program.java src/game/HashGame.java
java -cp out application.Program
```

## Organização

- `application/Program.java`: inicialização.
- `game/HashGame.java`: interface, eventos e regras.

## Escopo

Projeto de estudo de Java, orientação a objetos e eventos de interface. As partidas são locais; não há oponente de IA, multiplayer em rede ou persistência.
