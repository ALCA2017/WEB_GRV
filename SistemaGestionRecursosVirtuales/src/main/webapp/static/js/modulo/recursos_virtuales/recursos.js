var rutaWS='http://localhost:8455/';


/******************************************************************
 * Areas academicas del año seleccionado 
 ******************************************************************/
function CargarAreasAcademicasDelAnioSeleccionado(){
	limpiarListasSemanticas();
	$("#formSelectAnios").change(function() {		
		var id = $("#formSelectAnios").val();
		var params = {idAnio:id };		
		console.log("Cargando las áreas academicas del año escolar	"+id)
	    $.ajax({
	    	type: 'GET',
	        url: rutaWS+'/malla/areas_academicas?anioAcademico='+id,
	        data: params,
	        dataType: 'json',	        
	        success: function (data) {	       		
	       		$('#formSelectAreas').empty().append($('<option>').text('Seleccionar...').attr('value',''));
	        	$('#select').append($('<option>').text("Select"));
	        	$.each(data, function(i, obj) {	    
        	        $('#formSelectAreas').append($('<option>').
        	        		text(obj.nombreArea).attr('value',obj.idAreaAcademica));        	      
        	    });
	        },	        
	        error    : function(XMLHttpRequest, textStatus, errorThrown) {	        	
	        	 //alert("Status: " + textStatus); alert("Error: " + errorThrown);
	        	 console.log("Status : "+textStatus );
	        	 console.log("Error : "+errorThrown );
	        },
	        complete : function() {
	        //console.log("Años cargados correctamente!");
	       	}	        
	    });

	});		
}

/******************************************************************
 * Unidades didácticas del area academica seleccionado
 ******************************************************************/
function cargaUnidadesDelAreaSeleccionada(){
	limpiarListasSemanticas();
	$( "#formSelectAreas").change(function() {	
		var id = $("#formSelectAreas").val();
		var params = {idArea:id };		
		console.log("Cargando Unidades de las áreas"+id)
	    $.ajax({
	    	type: 'GET',
	        url: rutaWS+'/malla/unidades_didacticas?idAreaAcademica='+id,
	        data: params,
	        dataType: 'json',	        
	        success: function (data) {
	       		$('#formSelectUnidades').empty().append($('<option>').text('Seleccionar...').attr('value',''));
	        	$('#select').append($('<option>').text("Select"));
	        	$.each(data, function(i, obj) {	    
	    	        $('#formSelectUnidades').append($('<option>').
	    	        		text("Unidad "+obj.idUnidadDidactica +" - " +obj.tituloUnidad).attr('value',obj.idUnidadDidactica));        	      
	    	    });
	        },	        
	        error    : function(XMLHttpRequest, textStatus, errorThrown) {	        	
	        	 //alert("Status: " + textStatus); alert("Error: " + errorThrown);
	        	 console.log("Status : "+textStatus );
	        	 console.log("Error : "+errorThrown );
	        },
	        complete : function() {
	        	// console.log("Complete..." );
	       	}	        
	    });

	});
	
}

/******************************************************************
 * Temas de la unidad seleccionada
 ******************************************************************/
function cargaTemasDeLaUnidadSeleccionada(){
	limpiarListasSemanticas();
	$( "#formSelectUnidades").change(function() {
		var id = $("#formSelectUnidades").val();
		var params = {idUnidadDidactica:id };		
		
		    $.ajax({
		    	type: 'GET',
		        url: rutaWS+'/malla/temas_unidades',
		        data: params,
		        dataType: 'json',	        
		        success: function (data) {        	
		        	var temaList = '';//'<li href="#" class="list-group-item title"> Temas de la Unidad</li>';  
		        	
		  	    	$.each(data, function(i, item) {
		  	    		temaList = temaList +'<li class="list-group-item text-left"><a href="#" onclick="cargarTemaParaBusqueda(\''+data[i].campo_tematico+'\','+data[i].id_sesion+');"><label class="name">'+ data[i].campo_tematico+'</label></a>'+"\n"
		  	    							+'<label class="pull-right">'+"\n" 
		  	    							+'<a class="glyphicon glyphicon-facetime-video" href="#" title="Video">('+ data[i].nroVIDEO+')</a>'+"\n" 
							  	    		+'<a class="glyphicon glyphicon-picture" href="#" title="Imagen">('+ data[i].nroIMG+')</a>'+"\n" 
							  	    		+'<a class="glyphicon glyphicon-cloud-upload" href="#" title="Web">('+ data[i].nroWEB+')</a>'+"\n" 
							  	    		+'</label><div class="break"></div>'+"\n"
							  	    		+'</li> ';		  	    	  
		  	    	});
		  	    	$("#list-temas").html(temaList);
		        },		        
		        error    : function(XMLHttpRequest, textStatus, errorThrown) {	        	
		        	 console.log("Status : "+textStatus );
		        	 console.log("Error : "+errorThrown );
		        },
		        complete : function() {
		        	console.log("Complete..." );
		       	}	        
		    });
	
		});		
}


function cargarTemaParaBusqueda(buscartema, idTema){	
	limpiarListasSemanticas();
	document.getElementById("idTemaSeleccionado").value = idTema;	
	document.getElementById("hyv-search").value = buscartema;	
	document.getElementById("busqueda_semantica").style.visibility = "visible"
}

function AsignarRecursosAlTema(){

	var v = $("input[name=radioVideo]:checked");
	var i = $("input[name=radioImage]:checked");
	var w = $("input[name=radioWeb]:checked");
	
	$('body').off('load');

	rtotal = v.length + i.length + w.length;
	if (v.length==1 || i.length==1 || w.length==1){
		
		swal({
			  title: "Est\u00e1s seguro?",
			  text: "Se va asignar "+rtotal+" recurso(s) al tema seleccionado!",
			  type: "warning",
			  showCancelButton: true,
			  confirmButtonClass: "btn-danger",
			  confirmButtonText: "Si, asignar!",
			  closeOnConfirm: false
			},
			function(){
				if(v.length==1){GuardarVideo();}
				if(i.length==1){GuardarImagen();}
				if(w.length==1){GuardarWeb();}	
				if(rtotal==1){
					swal("Exitoso!", "El recurso fue asignado al tema seleccionado.", "success");
				}else{
					swal("Exitoso!", "Los recursos fueron asignados al tema seleccionado.", "success");	
				}
				limpiarListasSemanticas();
				
			});
	}else{
		 swal("Error!", "Debes seleccionar al menos un recurso!", "error");
	}    		         	
	
}

function limpiarListasSemanticas(){
	document.getElementById('hyv-see-related').innerHTML='';
	document.getElementById('hyv-read-related').innerHTML='';
	document.getElementById('hyv-watch-related').innerHTML='';
	document.getElementById("btnGuardarRecurso").disabled = true;
}

function Cancel(){
	limpiarListasSemanticas();
}

function deletePhoto_origin(photoId) {
    swal({
      title: "Are you sure?", 
      text: "Are you sure that you want to delete this photo?", 
      type: "warning",
      showCancelButton: true,
      closeOnConfirm: false,
      confirmButtonText: "Yes, delete it!",
      confirmButtonColor: "#ec6c62"
    }, function() {
      $.ajax({
        url: "/api/photos/" + photoId,
        type: "DELETE"
      })
      .done(function(data) {
        swal("Deleted!", "Your file was successfully deleted!", "success");
      })
      .error(function(data) {
        swal("Oops", "We couldn't connect to the server!", "error");
      });
    });
  }

function GuardarVideo(){
	
	var videoData = $('input[name=radioVideo]:checked').val(); 
	var arr = videoData.split('|');
	
	var params = {			
			Idsesion:$("#idTemaSeleccionado").val(),
			Result: arr[0],Text: arr[1],URL: arr[2],			
			};	
	    $.ajax({
	    	type: 'GET',
	        url: 'video/create',
	        data: params,
	        dataType: 'json',	        
	        success: function (data) {        	
	        	console.log("Se inserto video exitosamente"  );
	        },	        
	        error    : function(XMLHttpRequest, textStatus, errorThrown) {	        	
	        	 console.log("Status : "+textStatus );
	        	 console.log("Error : "+errorThrown );
	        },
	        complete : function() {

	       	}	        
	    });
}

function GuardarImagen(){

	var imageData = $('input[name=radioImage]:checked').val(); 
	var arr = imageData.split('|');
	
	var params = {
			Idsesion:$("#idTemaSeleccionado").val(), 
			Result: arr[0],Text: arr[1],URL: arr[2],
			};	
	    $.ajax({
	    	type: 'GET',
	        url: 'imagen/create',
	        data: params,
	        dataType: 'json',	        
	        success: function (data) {        	
	        	console.log("Se inserto imagen exitosamente"  );
	        },	        
	        error    : function(XMLHttpRequest, textStatus, errorThrown) {	        	
	        	 console.log("Status : "+textStatus );
	        	 console.log("Error : "+errorThrown );
	        },
	        complete : function() {
	       	}	        
	    });
}

function GuardarWeb(){

	var videWeb = $('input[name=radioWeb]:checked').val(); 
	var arr = videWeb.split('|');
	
	var params = {
			Idsesion:$("#idTemaSeleccionado").val(), 
			Result: arr[0],Text: arr[1],URL: arr[2],
			};	
	    $.ajax({
	    	type: 'GET',
	        url: 'web/create',
	        data: params,
	        dataType: 'json',	        
	        success: function (data) {        	
	        	console.log("Se inserto web exitosamente"  );
	        },	        
	        error    : function(XMLHttpRequest, textStatus, errorThrown) {	        	
	        	 console.log("Status : "+textStatus );
	        	 console.log("Error : "+errorThrown );
	        },
	        complete : function() {

	       	}	        
	    });
}


/******************************************************************
 * Año escolar
 ******************************************************************/
/*function CargarAnios(){
		
	console.log("Cargando las años académicos")
    $.ajax({
    	type: 'GET',
        url: rutaWS+'/malla/anios_academicos',
        data: params,
        dataType: 'json',	        
        success: function (data) {
       		$('#formSelectAreas').empty();       	
        	$('#select').append($('<option>').text("Select"));
        	$.each(data, function(i, obj) {	    
    	        $('#formSelectAreas').append($('<option>').
    	        		text(obj.nombreArea).attr('value',obj.idAreaAcademica));        	      
    	    });
        },	        
        error    : function(XMLHttpRequest, textStatus, errorThrown) {	        	
        	 //alert("Status: " + textStatus); alert("Error: " + errorThrown);
        	 console.log("Status : "+textStatus );
        	 console.log("Error : "+errorThrown );
        },
        complete : function() {
        console.log("Años cargados correctamente!");
       	}	        
    });

}*/