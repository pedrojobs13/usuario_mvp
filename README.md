Sistema de Gestão - README
Requisitos não Funcionais
RNF01 – Casos de Uso do tipo CRUD com State
O sistema implementa casos de uso do tipo CRUD seguindo as práticas discutidas em aula, utilizando o padrão de navegação entre janelas disponível em Whimsical - CRUD Manter.

RNF02 – Persistência de Dados
Para a persistência de dados, é utilizado o SQLite como banco de dados. Garantimos que não há necessidade de instalações ou configurações extras no ambiente de implementação. O uso do Docker para manter o banco de dados não é permitido, conforme especificado.

RNF03 – Padrão de Projeto DAO
O sistema emprega o padrão de projeto DAO para manipulação de dados, evitando o uso de frameworks de persistência como Hibernate ou similares.

RNF04 – Interface Gráfica
O desenvolvimento da interface gráfica é realizado utilizando o kit de componentes gráficos do Java Swing. O sistema permite a navegação entre telas abertas e adota o padrão MDI (Multiple Document Interface).

RNF05 – Utilização do Padrão Command
Na implementação do State, é utilizado o padrão Command integrado a ele.

RNF06 – Padrão de Projeto Observer
É implementado o padrão Observer, garantindo que alterações realizadas por um usuário em uma janela sejam refletidas em outras janelas abertas referentes aos mesmos dados.

RNF07 – Formatos de Arquivos de Log
O sistema permite a geração de arquivos de log nos formatos CSV (com separação de campos usando ponto e vírgula “;”) e JSON.

RNF08 – Padrão de Projeto Adapter para Log
O módulo de log adota o padrão de projeto Adapter e é um projeto Maven independente, utilizado pelo sistema proposto nesta especificação.

RNF09 – Criação de Senhas
Na criação de senhas do sistema, é utilizado o Validador de Senhas disponível em GitHub - ValidadorSenha, que é incluído como JAR no projeto Maven por meio do JitPack (https://jitpack.io/).
