<%-- 
    Nome: Rafael Ferreira Gomes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="data" %>

<!DOCTYPE html>

<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        
        <link rel="stylesheet" href="css/bootstrap.min.css" />
        <link rel="stylesheet" href="css/styles.css" />
        
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        
        <title>Exercício 1 P2</title>

    </head>

    <body>

        <div class="container-fluid" id="pagina">
            
            <h1>Digite seu nome e data de nascimento</h1>
            
            <p>&nbsp;</p>
            
            <form class="form-horizontal" action="mostrardados.jsp" method="POST">
                
                <div class="form-group">
                    
                    <label class="control-label col-md-offset-2 col-md-3" for="nome">Nome: </label>
                    
                    <div class="col-md-2">
                    
                        <input type="text" class="form-control" name="nome" id="nome" />
                
                    </div>
                    
                </div>

                <div class="form-group">
                    
                    <label class="control-label col-md-offset-2 col-md-3" for="datanascimento">Data de nascimento:</label>
                    
                    <div class="col-md-2">
                        
                        <data:campoData id="datanascimento" />
                        
                    </div>
                    
                </div>
                        
                <div class="form-group">
                    
                    <div class="col-md-offset-5 col-md-6">
                        
                        <button type="submit" class="btn btn-default">Mostrar dados</button>
                        <button type="button" class="col-md-offset-1 btn btn-default"><a href="index.html">Menu Inicial</a></button>
                    
                    </div>
                    
                </div>
                
            </form>
            
        </div>

    </body>

</html>