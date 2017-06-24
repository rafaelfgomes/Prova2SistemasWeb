<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="pt-br">
    
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        
        <link rel="stylesheet" href="css/bootstrap.min.css" />
        <link rel="stylesheet" href="css/styles.css" />
        
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        
        <title>Dados digitados</title>
        
    </head>
    
    <body>
        
        <div class="container-fluid" id="pagina">
            
            <div class="row" id="titulo_main">
                
                <div class="col-md-12 text-center">
                    
                    <h1>Parâmetros digitados</h1>
                    
                </div>
                
            </div>
            
            <div class="row" id="conteudo">
                
                <p>&nbsp;</p>
                
                <div class="col-md-offset-4 col-md-8">
                    
                    <p class="paragrafo"><span class="col-md-offset-3"></span>Nome: ${param.nome}</p>
                    <p class="paragrafo"><span class="col-md-offset-1"></span>Data de nascimento: ${param.datanascimento}</p>
                    
                </div>
                    
            </div>
            
            <div class="form-group">
                        
                <div class="col-md-offset-5 col-md-6">
                            
                    <button type="button" class="col-md-offset-1 btn btn-default"><a href="index.html">Página Inicial</a></button>
                            
                </div>
                        
            </div>
                    
            <p>&nbsp;</p>
            
        </div>
        
    </body>
    
</html>
