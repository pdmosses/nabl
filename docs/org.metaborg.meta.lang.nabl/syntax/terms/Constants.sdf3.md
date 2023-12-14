---
title: Constants.sdf3
hide:
  - toc
---

# `Constants.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/terms/Constants.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/terms/Constants.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/terms/Constants.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="terms/Constants_1_8" title="Multi-file references" data-urls="../Signatures.sdf3/#terms/Constants_6_2 line 6; ../Terms.sdf3/#terms/Constants_5_3 line 5">terms/Constants</button>

<span class="keyword">sorts</span> 

  <a href="../Terms.sdf3/#Int_16_19" id="Int_5_3" title="Referenced at ../Terms.sdf3 line 16, 34">Int</a> <a href="../Terms.sdf3/#Real_17_20" id="Real_5_7" title="Referenced at ../Terms.sdf3 line 17, 35">Real</a> <button class="modal-open" id="String_5_12" title="Multi-file references" data-urls="../Signatures.sdf3/#String_23_24 line 23, 24; ../Terms.sdf3/#String_18_19 line 18, 20, 36, 38">String</button> <a href="#StrChar_11_18" id="StrChar_5_19" title="Referenced at line 11">StrChar</a>

<span class="keyword">lexical syntax</span>

  <a href="../Terms.sdf3/#Int_16_19" id="Int_9_3" title="Referenced at ../Terms.sdf3 line 16, 34">Int</a>     = [\-]? [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+
  <a href="../Terms.sdf3/#Real_17_20" id="Real_10_3" title="Referenced at ../Terms.sdf3 line 17, 35">Real</a>    = [\-]? [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+ [\.] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+
  <button class="modal-open" id="String_11_3" title="Multi-file references" data-urls="../Signatures.sdf3/#String_23_24 line 23, 24; ../Terms.sdf3/#String_18_19 line 18, 20, 36, 38">String</button>  = <span class="cons_Lit">"\""</span> <a href="#StrChar_5_19" id="StrChar_11_18" title="Defined at line 5, 12, 13">StrChar</a>* <span class="cons_Lit">"\""</span>
  <a href="#StrChar_11_18" id="StrChar_12_3" title="Referenced at line 11">StrChar</a> = ~[\"\\]
  <a href="#StrChar_11_18" id="StrChar_13_3" title="Referenced at line 11">StrChar</a> = [\\] [\"<span class="cons_Regular">t</span><span class="cons_Regular">n</span><span class="cons_Regular">r</span>\\]

<span class="keyword">sorts</span> <button class="modal-open" id="Char_15_7" title="Multi-file references" data-urls="#Char_25_8 line 25; ../Terms.sdf3/#Char_21_20 line 21, 39">Char</button> <a href="#CharChar_19_18" id="CharChar_15_12" title="Referenced at line 19">CharChar</a>

<span class="keyword">lexical syntax</span>
  
  <button class="modal-open" id="Char_19_3" title="Multi-file references" data-urls="#Char_25_8 line 25; ../Terms.sdf3/#Char_21_20 line 21, 39">Char</button>     = <span class="cons_Lit">"'"</span> <a href="#CharChar_15_12" id="CharChar_19_18" title="Defined at line 15, 20, 21">CharChar</a> <span class="cons_Lit">"'"</span>
  <a href="#CharChar_19_18" id="CharChar_20_3" title="Referenced at line 19">CharChar</a> = ~[\']
  <a href="#CharChar_19_18" id="CharChar_21_3" title="Referenced at line 19">CharChar</a> = [\\] [\'<span class="cons_Regular">n</span><span class="cons_Regular">t</span><span class="cons_Regular">r</span>\ ]
  
<span class="keyword">lexical syntax</span>

  <span id="Id_25_3" title="Not referenced">Id</span> = <a href="#Char_15_7" id="Char_25_8" title="Defined at line 15, 19">Char</a> {<span class="keyword">reject</span>}

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
