<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<h1>New Dojo</h1>
<form:form action="/dojos" method="post" modelAttribute="dojo">
    <p>
        <form:label path="title">Dojo Name</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="description">Styles</form:label>
        <form:errors path="description"/>
        <form:textarea path="description"/>
    </p>
    <p>
        <form:label path="language">Trainers</form:label>
        <form:errors path="language"/>
        <form:input path="language"/>
    </p>
    <p>
        <form:label path="numberOfPages"> World Ranking</form:label>
        <form:errors path="numberOfPages"/>     
        <form:input type="number" path="numberOfPages"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    