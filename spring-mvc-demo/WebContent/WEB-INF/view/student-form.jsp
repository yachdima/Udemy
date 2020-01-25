<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First Name: <form:input path="firstName" />
		
		<br><br>
		
		Last Name: <form:input path="lastName" />
		
		<br><br>
		
		Country: 
		
		<form:select path="country">
			
			<form:options items="${student.countryOptions}"></form:options>
			
		</form:select>
		
		<br><br>
		
		Favorite Language:
		
		JAVA <form:radiobutton path="favoriteLanguage" value="Java"/>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/>
		PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
		RUBY <form:radiobutton path="favoriteLanguage" value="RUBY"/>
		
		<br><br>
		
		Operating Systems:
		
		Windows <form:checkbox path="operatingSystems" value="Windows"/>
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac <form:checkbox path="operatingSystems" value="Mac"/>
		
		<br><br>
				
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>