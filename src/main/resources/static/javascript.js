$(function() {

var url ='/getCategorias';

$.getJSON(url,
     function(respuesta) {
	var ul = document.getElementById("ulCat");	//Punto de partida para acoplar elementos.
	for(categoria in respuesta){
		var id = respuesta[categoria].id;		//ID de cada categoria
		var li = document.createElement("li");	//Elemento de la lista que acoplaremos a ulCat
		li.id = "categoria"+id;
		li.appendChild(document.createTextNode(respuesta[categoria].nombre));
		var button = document.createElement("button");
		button.id = "btEspecie"+id
		button.innerHTML = "Mostrar Especies";
		button.setAttribute("onClick", "mostrarEspecies("+id+","+li.id+")");
		li.appendChild(button);
		ul.appendChild(li);
	}
	

  });
});


function mostrarEspecies(cat_id){
	var ul = document.createElement("ul")
	ul.id = "ulEspecies"+cat_id
	
	if(document.getElementById("btEspecie"+cat_id).innerHTML == 'Mostrar Especies'){
	var url2 = '/getCategoria/'+cat_id+'/listaEspecies';
	$.getJSON(url2,
	function(respuesta){
		document.getElementById("categoria"+cat_id).appendChild(ul)
			
		for(especie in respuesta){
			var id = respuesta[especie].especie_id		//Id de cada especie
			var li2 = document.createElement("li2");	//Elemento de la lista que acoplaremos a liId

			li2.id = "especie"+id+cat_id
			li2.appendChild(document.createTextNode(respuesta[especie].nombreVulgar));
			
			ul.appendChild(li2)
			
			var buttonPlagas = document.createElement("button");	
			buttonPlagas.id = "btPlaga"+id+cat_id		
			buttonPlagas.innerHTML = "Mostrar Plagas";
			
			li2.appendChild(buttonPlagas);	
			li2.appendChild(document.createElement("br"));		
			
			document.getElementById("btEspecie"+cat_id).innerHTML = "Ocultar Especies"
			buttonPlagas.setAttribute("onClick", "mostrarPlagas("+id+","+cat_id+")");
			
		}
	});
	}else{
		eliminarEspecies(cat_id)
	}

};

function mostrarPlagas(esp_id, categoria_id){
	var ul = document.createElement("ul")
	ul.id = "ulPlagas"+esp_id+categoria_id
	
	if(document.getElementById("btPlaga"+esp_id+categoria_id).innerHTML == 'Mostrar Plagas'){
	var url3 = '/getEspecies/'+esp_id+'/listaPlagas';
	$.getJSON(url3,
	function(respuesta){
		document.getElementById("especie"+esp_id+categoria_id).appendChild(ul)
		
		for(plaga in respuesta){
			var id = respuesta[plaga].plaga_id		//Id de cada especie
			var li2 = document.createElement("li2");	//Elemento de la lista que acoplaremos a liId
			li2.id = "plaga"+id+esp_id
			li2.appendChild(document.createTextNode(respuesta[plaga].nombreVulgar));
			
			ul.appendChild(li2)
			
			
			var buttonSustancias = document.createElement("button");	
			buttonSustancias.id = "btSust"+id+esp_id		
			buttonSustancias.innerHTML = "Mostrar Sustancias";

			li2.appendChild(buttonSustancias);
			li2.appendChild(document.createElement("br"));
			document.getElementById("btPlaga"+esp_id+categoria_id).innerHTML = "Ocultar Plagas"
			buttonSustancias.setAttribute("onClick", "mostrarSustancias("+id+","+esp_id+")");
			
		}
	});
	}else{
		eliminarPlagas(esp_id, categoria_id)
	}

};


	function mostrarSustancias(plaga_id, especie_id){
	var ul = document.createElement("ul");		//Punto de partida de acople		
	ul.id = "ulSustancias"+plaga_id+especie_id	
			
	if(document.getElementById("btSust"+plaga_id+especie_id).innerHTML == 'Mostrar Sustancias'){
	var url4 = '/getPlagas/'+plaga_id+'/SustActiva';
	$.getJSON(url4,
	function(respuesta){
		document.getElementById('plaga'+plaga_id+especie_id).appendChild(ul)

		for(sustActiva in respuesta){
			var id = respuesta[sustActiva].sustancia_id		//Id de cada sustancia
			var li2 = document.createElement("li2");	//Elemento de la lista que acoplaremos a liId
			li2.id = "sust"+id+plaga_id
			li2.appendChild(document.createTextNode(respuesta[sustActiva].nombre))

			ul.appendChild(li2)
			
			
			var buttonProductos = document.createElement("button");
			buttonProductos.id = "btProd"+id+plaga_id;
			buttonProductos.innerHTML = "Mostrar Productos"

			li2.appendChild(buttonProductos)
			li2.appendChild(document.createElement("br"));
			
			document.getElementById("btSust"+plaga_id+especie_id).innerHTML = "Ocultar Sustancias"

			buttonProductos.setAttribute("onClick", "mostrarProductos("+id+ ',' + plaga_id + ")");	
		}
	});
	}else{
		eliminarSustancias(plaga_id , especie_id);
	}

};



	function mostrarProductos(sust_id, plaga_id){
	var ul = document.createElement("ul");		//Punto de partida de acople
	ul.id = "ulProductos"+sust_id+plaga_id
	if(document.getElementById('btProd'+sust_id+plaga_id).innerHTML == 'Mostrar Productos'){
			var url4 = '/getSustActivas/'+sust_id+'/ProductoFitosanitario';
			$.getJSON(url4,
				function(respuesta){

					document.getElementById('sust'+sust_id+plaga_id).appendChild(ul);	
					for(producto in respuesta){
						var id = respuesta[producto].producto_id		//Id de cada sustancia
						var li2 = document.createElement("li2");	//Elemento de la lista que acoplaremos a liId
						li2.id = "sust"+id
						li2.appendChild(document.createTextNode(respuesta[producto].nombre));
						li2.appendChild(document.createElement("br"));
						ul.appendChild(li2);

						document.getElementById('btProd'+sust_id+plaga_id).innerHTML = "Ocultar Productos"

					}
				});
	}else{
		eliminarProductos(sust_id , plaga_id);
	}



};

function eliminarProductos(sust_id , plaga_id){
		document.getElementById("ulProductos"+sust_id+plaga_id).remove();
	  	document.getElementById('btProd'+sust_id+plaga_id).innerHTML = "Mostrar Productos"
}

function eliminarSustancias(plaga_id , especie_id){
		document.getElementById("ulSustancias"+plaga_id+especie_id).remove();
	  	document.getElementById('btSust'+plaga_id+especie_id).innerHTML = "Mostrar Sustancias"
}

function eliminarPlagas(especie_id , categoria_id){
		document.getElementById("ulPlagas"+especie_id+categoria_id).remove();
	  	document.getElementById('btPlaga'+especie_id+categoria_id).innerHTML = "Mostrar Plagas"
}

function eliminarEspecies(categoria_id){
		document.getElementById("ulEspecies"+categoria_id).remove();
	  	document.getElementById('btEspecie'+categoria_id).innerHTML = "Mostrar Especies"
}