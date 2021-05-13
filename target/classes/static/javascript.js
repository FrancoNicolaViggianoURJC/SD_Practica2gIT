$(function() {

var url ='/getCategorias';

$.getJSON(url,
     function(respuesta) {
	var ul = document.getElementById("ulCat");	//Punto de partida para acoplar elementos.
	for(categoria in respuesta){
		var id = respuesta[categoria].id;		//ID de cada categoria
		var li = document.createElement("li");	//Elemento de la lista que acoplaremos a ulCat
		li.id = "cat"+id;
		li.appendChild(document.createTextNode(respuesta[categoria].nombre));
		var button = document.createElement("button");
		button.innerHTML = "Mostrar especies";
		button.setAttribute("onClick", "mostrarEspecies("+id+","+li.id+")");
		li.appendChild(button);
		ul.appendChild(li);
	}
	

  });
});


function mostrarEspecies(cat_id, liId){
	var url2 = '/getCategoria/'+cat_id+'/listaEspecies';
	$.getJSON(url2,
	function(respuesta){
		var ul = document.createElement("ul");		//Punto de partida de acople
		liId.appendChild(ul);		
		for(especie in respuesta){
			var id = respuesta[especie].especie_id		//Id de cada especie
			var li2 = document.createElement("li2");	//Elemento de la lista que acoplaremos a liId
			//document.getElementById(liId).appendChild(li2)		//Acoplar a liId el hijo
			li2.id = "esp"+id
			li2.appendChild(document.createTextNode(respuesta[especie].nombreVulgar));
			var button = document.createElement("button");			
			button.innerHTML = "Mostrar plagas";
			button.setAttribute("onClick", "mostrarPlagas("+id+","+li2.id+")");
			li2.appendChild(button);
			li2.appendChild(document.createElement("br"));
			ul.appendChild(li2);
			
		}
	});

};

function mostrarPlagas(esp_id, liId){

	var url3 = '/getEspecies/'+esp_id+'/listaPlagas';
	$.getJSON(url3,
	function(respuesta){
		var ul = document.createElement("ul");		//Punto de partida de acople
		liId.appendChild(ul);	
		for(plaga in respuesta){
			var id = respuesta[plaga].plaga_id		//Id de cada especie
			var li2 = document.createElement("li2");	//Elemento de la lista que acoplaremos a liId
			li2.id = "plaga"+id
			li2.appendChild(document.createTextNode(respuesta[plaga].nombreVulgar));
			var button = document.createElement("button");			
			button.innerHTML = "Mostrar Sustancias";
			button.setAttribute("onClick", "mostrarSustancias("+id+","+li2.id+")");
			li2.appendChild(button);
			li2.appendChild(document.createElement("br"));
			ul.appendChild(li2);
			
		}
	});

};

function mostrarSustancias(plaga_id, liId){
	var url4 = '/getPlagas/'+plaga_id+'/SustActiva';
	$.getJSON(url4,
	function(respuesta){
		var ul = document.createElement("ul");		//Punto de partida de acople
		liId.appendChild(ul);		
		for(sustActiva in respuesta){
			var id = respuesta[sustActiva].sustancia_id		//Id de cada sustancia
			var li2 = document.createElement("li2");	//Elemento de la lista que acoplaremos a liId
			li2.id = "sust"+id
			li2.appendChild(document.createTextNode(respuesta[sustActiva].nombre));
			var button = document.createElement("button");			
			button.innerHTML = "Mostrar Productos";
			button.setAttribute("onClick", "mostrarProductos("+id+","+li2.id+")");

				//while (li2.firstChild) {
    			//		li2.removeChild(li2.lastChild);
  				//}
			li2.appendChild(button);
			li2.appendChild(document.createElement("br"));
			ul.appendChild(li2);
			
		}
	});

};

function mostrarProductos(sust_id, liId){
	var url4 = '/getSustActivas/'+sust_id+'/ProductoFitosanitario';
	$.getJSON(url4,
	function(respuesta){
		var ul = document.createElement("ul");		//Punto de partida de acople
		liId.appendChild(ul);	
		for(producto in respuesta){
			var id = respuesta[producto].producto_id		//Id de cada sustancia
			var li2 = document.createElement("li2");	//Elemento de la lista que acoplaremos a liId
			li2.id = "sust"+id
			li2.appendChild(document.createTextNode(respuesta[producto].nombre));
			li2.appendChild(document.createElement("br"));
			ul.appendChild(li2);
		}
	});

};
