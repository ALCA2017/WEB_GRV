function cargarTablaTemas(){
	var id = $("#formSelectUnidades").val();
	var params = {idUnidadDidactica:id };		
	
    $.ajax({
    	type: 'GET',
        url: 'unidadesAcademicas/temas_recursos',
        data: params,
        dataType: 'json',	        
        success: function (data) {        	
        	    $.each(data, function(i, obj) {	   
        	        $('#"tablaTemas"').append(data);
        	    	$('#tabla tbody').append('<tr></tr><tr></tr><tr></tr>');
                    var row = $('#tabla tbody tr').last();
                    var objeto = $(this);
                    row.append('<td>' + obj.campo_tematico + '</td>');        	    	
                    row.append('<td>' + obj.nroIMG + '</td>');
                    row.append('<td>' + obj.nroVIDEO + '</td>');
                    row.append('<td>' + obj.nroWEB + '</td>'); 
        	    	
        	    });
        },	        
        error    : function(XMLHttpRequest, textStatus, errorThrown) {	        	
        	 console.log("Status : "+textStatus );
        	 console.log("Error : "+errorThrown );
        },
        complete : function() {
        	// console.log("Complete..." );
       	}	        
    });
}
