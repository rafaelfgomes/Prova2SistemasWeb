create schema swii5_prova_rafaelferreiragomes;

use swii5_prova_rafaelferreiragomes;

create table funcionarios (
id BIGINT NOT NULL AUTO_INCREMENT,
nome VARCHAR(255),
departamento  VARCHAR(255),
funcao VARCHAR(255),
salario FLOAT,
dependentes INT,
dataContratacao DATE,
primary key (id)
);

insert into funcionarios (nome,departamento,funcao,salario,dependentes,dataContratacao) values ('Rafael Gomes','TI','Desenvolvedor Web',2800.00,0,'2017-07-20');
insert into funcionarios (nome,departamento,funcao,salario,dependentes,dataContratacao) values ('Zé Lelé','Serviços','Ajudante Geral',980.00,2,'1999-12-03');
insert into funcionarios (nome,departamento,funcao,salario,dependentes,dataContratacao) values ('Maria Catinga','Alimentício','Cozinheira',1100.00,3,'2003-02-10');
insert into funcionarios (nome,departamento,funcao,salario,dependentes,dataContratacao) values ('Caio Rolando','Administrativo','Auxiliar Administrativo',1500.00,0,'2014-01-15');
insert into funcionarios (nome,departamento,funcao,salario,dependentes,dataContratacao) values ('Pedro Pedrada','Financeiro','Auxiliar Contábil',1800.00,1,'2009-09-09');