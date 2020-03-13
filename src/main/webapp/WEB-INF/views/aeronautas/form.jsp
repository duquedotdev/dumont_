<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

	<%@ include file="navbar.jsp" %>





<title>Cadastro de produtos</title>
</head>
<body>





	<h3 class="display-4">Cadastro de Produtos</h3>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
	

	<form action="/casadocodigo/produtos" method="post">
		
		
		
		<form>
		  <div class="form-group col-md-6">
		    <label>Título</label>
		    <input type="text" class="form-control" name="titulo" aria-describedby="emailHelp" required>
<!-- 		    <small id="titulohelp" class="form-text text-muted">Insira o título do livro aqui.</small> -->
		  </div>
		  
		  <div class="form-group col-md-6">
		    <label>Descrição</label>
		    <textarea class="form-control" name="descricao" rows="3" required></textarea>
		  </div>

		  
		  <div class="form-group col-md-6">
		    <label>Páginas</label>
		    <input type="text" class="form-control" name="paginas" required>
		  </div>
		  
	
		<c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
			<div class="form-group col-md-6">
				<label>${tipoPreco }</label>
				<input type="text" class="form-control" name="precos[${status.index}].valor" required>
				<input type="hidden" class="form-control" name="precos[${status.index }].tipo" value="${tipoPreco}" required>
				
			</div>
		</c:forEach>
		
				
		 <button class="btn btn-primary" type="submit">Cadastrar</button>
		 
		 <a class="btn btn-primary" href="./" role="button"> Voltar</a>
		
		
		
	</form>
</body>
</html>