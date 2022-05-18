# Padroes-de-Projeto-Java

Repositório com as implementações dos padrões de projeto explorados no Bootcamp "GFT Start #4 Java" no Lab "Explorando Padrões de Proejtos na Prática com Java". Especificamente, esse projeto explorou alguns padrões usando o Spring Framework, são eles:

- Singleton
- Strategy/Repository
- Facade

Processo de Construção do Projeto
- Inicialmente foi seguido o passo a passo replicando o projeto que foi desenvolvido pelo instrutor;
- Segundo passo, sendo a primeira melhoria, foi subtituido os "GET AND SETTERS" pelo "LOMBOK" com objetivo de reduzir os códigos, deixando mais enxuto e menos verboso;
- Terceiro passo, segunda melhoria, foi inserido na entidade "Cliente" a variável CPF, colocando a seguinte nomenclatura, @Column(nullable = false, unique = true), dessa forma não é possível cadastrar um usuário repetido na API e caso seja informado um CPF inválido será apresentado um erro.
- Quarto passo, terceira melhoria, 
