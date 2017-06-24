<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="pt-br">
    
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        
        <link rel="stylesheet" href="css/bootstrap.min.css" />
        <link rel="stylesheet" href="css/styles.css" />
        
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        
        <title>Login</title>
        
    </head>
    
    <body>
        
        <div class="container-fluid" id="pagina">
            
            <div class="row" id="titulo_login">
                
                <div class="col-md-12 text-center">
                
                    <h1>Entre com seu usuário e senha</h1>
                    
                </div>
                
            </div>
            
            <p>&nbsp;</p>
            
            <form class="form-horizontal" action="VerificaLogin" method="POST">
                
                <div class="form-group">
                    
                    <label class="control-label col-md-5" for="usuario">Usuário:</label>
                    
                    <div class="col-md-3"> 
                        <input type="text" class="form-control" name="usuario" id="usuario" />
                    </div>                        
                    
                </div>
                
                <div class="form-group">
                    
                    <label class="control-label col-md-5" for="senha">Senha:</label>
                    
                    <div class="col-md-3"> 
                        <input type="password" class="form-control" name="senha" id="senha" />
                    </div>
                    
                </div>
                
                <div class="form-group">
                    
                    <div class="col-md-offset-6 col-md-4">
                        
                        <button type="submit" class="btn btn-default">Logar</button>
                        
                    </div>
                    
                </div>
                
            </form>
            
        </div>
        
    </body>
    
</html>
