import mysql.connector

try:
    con = mysql.connector.connect(host='localhost', database='db_Cadastro',user='root',password='123456')
    
    criar_tabela_SQL_P = """CREATE TABLE pessoa (Nome VARCHAR(50) NOT NULL, Idade TINYINT NOT NULL, Email VARCHAR(70) NOT NULL, Fone VARCHAR(11) NULL, cidade VARCHAR(40) NOT NULL, uf VARCHAR(50) NOT NULL, Id_Pessoa INT(10) NOT NULL, PRIMARY KEY (Id_Pessoa))"""
    criar_tabela_SQL_PF = """CREATE TABLE pessoa_fisica (Nome VARCHAR(50) NOT NULL, Idade TINYINT NOT NULL, Email VARCHAR(70) NOT NULL, Fone VARCHAR(11) NULL, cidade VARCHAR(40) NOT NULL, uf VARCHAR(50) NOT NULL, Id_Pessoa INT(10) NOT NULL, PRIMARY KEY (Id_Pessoa), CPF INT(11) NOT NULL)"""
    
    cursor = con.cursor()
    cursor.execute(criar_tabela_SQL_P)
    cursor.execute(criar_tabela_SQL_PF)
    print("Tabelas criadas com sucesso!")

except mysql.connector.Error as erro:
    print("Falha ao criar tabela no MySQL:  {}".format(erro))
finally:
    if (con.is_connected()):
        cursor.close()
        con.close()
        con.commit()
        print("Conexão ao MYSQL foi encerrada")
