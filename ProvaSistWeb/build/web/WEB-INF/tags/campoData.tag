<%@tag description="Campo data" pageEncoding="UTF-8"%>
<%@ attribute name="id" required="true" %>

<input type="text" id="${id}" name="${id}" />

<script type="text/javascript">
    
    $("#${id}").datepicker({dateFormat: ’dd/mm/yy’});

</script>

<%-- any content can be specified here e.g.: --%>
<h2>${message}</h2>