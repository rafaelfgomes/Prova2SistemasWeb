<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="pt-br">
    
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de funcionários</title>
        
        <link rel="stylesheet" href="css/bootstrap.min.css" />
        <link rel="stylesheet" href="css/styles.css" />
        
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        
    </head>
    
    <body>
        
        <div class="container-fluid" id="pagina">
            
            <div class="row" id="titulo_lista_contato">
                
                <div class="col-md-12 text-center">
                
                    <h1>Lista de funcionários</h1>
                    
                </div>
                
            </div>
            
            <p>&nbsp;</p>
            
            <jsp:useBean id="dao" class="dao.FuncionarioDAO"/>
                
            <div class="container">
            
                <div class="table-responsive">
                
                    <table class="table table-striped">
                
                        <thead>
                    
                            <tr>
                        
                                <th>Nome</th>
                                <th>Departamento</th>
                                <th>Função</th>
                                <th>Salário</th>
                                <th>Dependentes</th>
                                <th>Data da contratação</th>
                        
                            </tr>
                    
                        </thead>
                
                        <tbody>
            
                            <c:forEach var="funcionario" items="${dao.lista}">
            
                            <tr>

                                <td>${funcionario.nome}</td>
                                <td>${funcionario.departamento}</td>
                                <td>${funcionario.funcao}</td>
                                <td><fmt:setLocale value="pt_BR" /><fmt:formatNumber value="${funcionario.salario}" type="currency" /></td>
                                <td>
                                  
                                    <c:if test="${funcionario.dependentes > 0}">
                                        
                                        ${funcionario.dependentes}
                                    
                                    </c:if>
                                        
                                    <c:if test="${funcionario.dependentes == 0}">
                                        
                                        Funcionário sem dependentes
                                    
                                    </c:if>
                                </td>
                                <td><fmt:formatDate type="both" dateStyle="short" pattern="dd/MM/yyyy" value="${funcionario.dataContratacao.time}" /></td>
                
                            </tr>
            
                            </c:forEach>
                
                        </tbody>
        
                    </table>
                
                </div>
            
            </div>
            
            <div class="form-group">
                        
                <div class="col-md-offset-5 col-md-6">
                            
                    <button type="button" class="col-md-offset-1 btn btn-default"><a href="index.html">Menu Inicial</a></button>
                            
                </div>
                        
            </div>
                    
            <p>&nbsp;</p>
            
        </div>
        
    </body>
    
</html>
