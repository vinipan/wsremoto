function exibirartistas(){
    fetch("http://localhost:8080/artistas")
    .then(res => res.json())
    .then(res => preenchercombo(res));
}

function preenchercombo(lista){
    var saida = "";
    for (contador=0;contador<lista.length;contador++){
        saida +=
        "<option value='" + lista[contador].id + "'>" + lista[contador].nomeArtistico + "</option>";
    }
    document.getElementById("cmbartistas").innerHTML=saida;
}

function filtrar(){
    fetch("http://localhost:8080/artista/"+ document.getElementById("cmbartistas").value)
    .then(res => res.json())
    .then(res => preenchertabela(res.musicas));

}

function preenchertabela(lista){
    var saida=
        "<table class='table'> " + 
        "<thead>"+
        "<tr>" +
          "<th scope='col'>#</th>" + 
          "<th scope='col'>Música</th>" +
          "<th scope='col'>Lançamento</th>" + 
        "</tr>" + 
        "</thead>"
        "<tbody>";
    
        for(contador=0;contador<lista.length;contador++){
            saida+= 
            "<tr>" + 
            "<th scope='row'>" + lista[contador].id + "</th>" + 
            "<th scope='row'>" + lista[contador].titulo + "</th>" + 
            "<th scope='row'>" + lista[contador].lancamento + "</th>" +
            "</tr>";
        }
    
        saida+="</tbody></table>";
        document.getElementById("dados").innerHTML=saida;
    
    }