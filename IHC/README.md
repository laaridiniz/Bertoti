<p align="center">Larissa Aparecida Diniz Silva - RA: 1460482121029
<br>
[Em construção]</p>

<h1 align="center">Análise das Diretrizes de Acessibilidade de Conteúdo da Web (WCAG)</h1>

<br id="topo">

<p align="center">
  <a href="#intro">Introduction</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#principioum">Principle 1</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#principiodois">Principle 2</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#principiotres">Principle 3</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#principioquatro">Principle 4</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#dev">Dev</a>
</p>

<div id="#intro">

## ✨Introduction

<p align="justify">Atividade proposta na aula de 24/08/2022, como requisito de avaliação da disciplina Interação Humano-Computador, que compõe a grade curricular do curso de Análise e Desenvolvimento de Sistemas da FATEC-SJC.</p>

</div>

<div id="#principioum">
  
## 🖥 Principle 1 - Perceivable
  
<p align="justify">A partir deste princípio, as informações e os componentes da interface do usuário devem ser apresentáveis aos usuários de maneira que eles possam perceber. Esse princípio é dividido em quatro subprincípios: alternativas de texto, mídia baseada em tempo, adaptável e distinguível. <br><br>
<b> A) Alternativas de texto: </b>
<br></p>
<p>Forneça alternativas de texto para qualquer conteúdo que não seja de texto para que possa ser alterado para outras formas que as pessoas precisem, como letras grandes, braille, fala, símbolos ou linguagem mais simples.<br>
<br>
</p>
</div>

<div align="center">
  <img src="images/imagem_notebooks.jpg" alt="página web exibindo imagens" width="100%" height="100%">
</div>
  
<p align="center">Imagens exibidas na página durante a navegação.</p>
<br>
  
<div align="center">
  <img src="images/imagem_src.jpg" alt="página web exibindo texto alternativo para as imagens" width="100%" height="100%">
</div>
  
<p align="center"> ✅ Exibição do texto alternativo de cada uma das imagens (Dell).</p>
<br>
<b> B) Mídia baseada em tempo: </b>
<br></p>
<p align="justify">Quando se fala em mídia baseada em tempo ou <i>time-based media</i> é necessário ter em mente a ideia de tecnologias de vídeo, filme, slide, áudio, e todas aquelas que têm duração como dimensão e se desdobram para o espectador ao longo do tempo (Guggenheim, 2022). Nesses casos, o ideal é que sejam fornecidas alternativas para esse tipo de mídia, como legendas, língua de sinais, autodescrição etc.<br>
<br>
</p>
 
<div align="center">
  <img src="images/print_alura.jpg" alt="vídeo de apresentação do curso com legendas e recursos visuais" width="100%" height="100%">
</div>

 <p align="center"> ✅ Exibição de legendas e recursos visuais para enfatizar a mensagem (Alura).</p>
  <br>
 
 <div align="center">
  <img src="images/print_dell_sem_legendas.jpg" alt="vídeo de explicação dos produtos Dell" width="100%" height="100%">
 </div>

 <p align="center"> ❌ Mídia sem opção de legendas (Dell).</p>
  <br>
 
 <b> C) Adaptável: </b>
 <br></p>
 
 <p align="justify">Crie conteúdo que possa ser apresentado de diferentes formas sem perder informações ou estrutura.
 <br></p>
 
 <div align="center">
  <img src="images/youtube_retrato.jpeg" alt="vídeo do Youtube sendo executado na orientação retrato" width="450" height="900">
 </div>

 <p align="center"> ✅ A plataforma exibe de forma satisfatória o conteúdo tanto para desktop quanto para mobile (Youtube).</p>
  <br>
  
  <div align="center">
  <img src="images/youtube_paisagem.jpeg" alt="vídeo do Youtube sendo executado na orientação paisagem" width="100%" height="100%">
 </div>

 <p align="center"> ✅ Independentemente da orientação do dispositivo (Youtube).</p>
  <br>
 
 <div align="center">
  <img src="images/fatec_desktop.jpg" alt="Página web da Fatec exibida em desktop" width="100%" height="100%">
 </div>
 <p align="center"> ❌ Conteúdo do site se adapta bem ao navegador do Desktop (Fatec).</p>
  <br>

<div align="center">
  <img src="images/fatec_mobile_retrato.jpeg" alt="Página da Fatec não se adapta bem a dispositivos móveis" width="450" height="900">
 </div>
 <p align="center"> ❌ Mas quando acessado por dispositivos móveis, os elementos se sobrepõem (Fatec).</p>
  <br>
  
<div align="center">
  <img src="images/fatec_mobile_paisagem.jpeg" alt="Página da Fatec sendo exibida no modo paisagem no celular" width="100%" height="100%">
</div>

<p align="center"> ❌ Até mesmo na orientação paisagem (Fatec).</p>
  <br>

<b> D) Distinguível: </b>
    <br>
 <p align="justify">Torne mais fácil para os usuários ver e ouvir o conteúdo, incluindo a separação do primeiro plano do plano de fundo.
 <br>
 </p>
 
 <div align="center">
  <img src="images/fmu_alto_contraste.jpg" alt="página inicial do site da FMU apresenta alto contraste entre o texto e o plano de fundo" width="100%" height="100%">
 </div>
 <p align="center"> ✅ Alto contraste entre a fonte e o plano de fundo (FMU).</p>
  <br>
 
 <div align="center">
  <img src="images/fatec_contraste.jpg" alt="página inicial do site da Fatec apresenta baixo contraste entre o texto e o plano de fundo" width="100%" height="100%">
 </div>
 <p align="center"> ❌ Baixo contraste entre a fonte e o plano de fundo (Fatec).</p>
  <br>

→ [Voltar ao topo](#topo)

<div id="#principiodois">

## 🕹️ Principle 2 - Operable

<p align="justify">Por força deste princípio, os componentes da interface do usuário e a navegação devem ser operáveis, de acordo com os itens abaixo:<br>
<br>
<b> A) Teclado acessível: </b>
<br>
<p align="justify">Sempre que possível, disponibilize a opção de operar por meio de um teclado.
 <br></p>
</div>

<div align="center">
  <img src="images/americanas_teclado.jpg" alt="pagina das lojas americanas sendo operada por teclado" width="100%" height="100%">
 </div>
 
<p align="center"> ✅ Usando apenas algumas teclas, é possível pesquisar produtos e navegar pelas páginas do site (Americanas).</p>
  <br>
 
<b> B) Tempo suficiente: </b>
<br>
<p align="justify">O ideal é que se forneça aos usuários tempo suficiente para ler e usar conteúdo. Então, informações móveis que começam automaticamente devem contar com um mecanismo para que o usuário possa pausar, parar ou escondê-lo. Exemplo desse caso são os termos de privacidade dos sites que, após a entrada em vigor da LGPD, passaram a obrigar a transparência dos sites em relação ao tratamento dos dados do usuário. O ideal é que esses avisos não atrapalhem a navegação do usuário, porém, ainda há algumas páginas que renderizam esse tipo de informação de uma maneira que obriga o usuário a tomar algum tipo de ação para só então poder navegar naquele site.
<br></p>

<div align="center">
  <img src="images/google_privacidade.jpg" alt="página do buscador Google" width="100%" height="100%">
</div>
 
<p align="center"> ✅ Em determinados buscadores online, o usuário não fica impedido de usar alguma funcionalidade e ainda tem uma opção específica disponível para acessar a política de privacidade e outras informações relevantes (Google).</p>
<br>
  
<div align="center">
  <img src="images/bing_privacidade.jpg" alt="página inicial do buscador Bing impede que o usuário navegue antes de configurar o uso dos seus dados" width="100%" height="100%">
</div>
<p align="center"> ❌ Algumas páginas ainda exibem avisos de uso de dados do usuário que o impedem de navegar no site sem antes configurar as permissões desejadas (Bing).</p>
<br>

<b> C) Reações físicas: </b>
<br>
<b> D) Navegável: </b>
<br>
<b> E) Modalidades de input: </b></p>

→ [Voltar ao topo](#topo)

<div id="#principiotres">

## 🧠 Principle 3 - Undestandable

<p align="justify">Tendo em vista esse princípio, as informações e o funcionamento da interface do usuário devem ser compreensíveis, ou seja, deve ser legível, previsível e navegável, conforme mostrado a seguir:<br>
<br>
<b> A) Legível: </b>
<br>
<b> B) Previsível: </b>
<br>
<b> C) Assistência de entrada: </b>
<br></p>

</div>

→ [Voltar ao topo](#topo)

<div id="#principioquatro">

## 🧩 Principle 4 - Robust

<p align="justify">A partir desse princípio, o conteúdo deve ser robusto o suficiente para que possa ser interpretado por uma grande variedade de agentes do usuário, incluindo tecnologias assistivas.<br>
<br>
<b> A) Compatível: </b>
<br>
</p>

</div>

<div id="#dev">
  
> Larissa Diniz, 2022 :star2: <br>
> ❤️ [Github](https://github.com/laaridiniz)<br>
> 💙 [LinkedIn](https://www.linkedin.com/in/larissa-diniz-dev/)<br>

</div>

→ [Voltar ao topo](#topo)
