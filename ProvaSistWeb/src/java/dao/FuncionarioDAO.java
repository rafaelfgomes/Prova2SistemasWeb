package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.Funcionario;

public class FuncionarioDAO {
    
    private Connection connection;
    
    public FuncionarioDAO()
    {
        
        this.connection = new ConnectionFactory().getConnection();
        
    }
    
    public List<Funcionario> getLista()
    {
        
        try {
            
            List<Funcionario> funcionarios = new ArrayList<>();
            PreparedStatement stmt = this.connection.prepareStatement("select * from funcionarios");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getLong("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setDepartamento(rs.getString("departamento"));
                funcionario.setFuncao(rs.getString("funcao"));
                funcionario.setSalario(rs.getDouble("salario"));
                funcionario.setDependentes(rs.getInt("dependentes"));
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("dataContratacao"));
                funcionario.setDataContratacao(data);
                
                funcionarios.add(funcionario);
                
            }
            
            rs.close();
            stmt.close();
            
            return funcionarios;
            
        } catch (Exception e) {
            
            throw new RuntimeException(e);
            
        }
        
    }
    
}
