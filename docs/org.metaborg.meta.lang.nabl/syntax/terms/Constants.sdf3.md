---
title: Constants.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Terms.sdf3#terms/Constants_32_47" id="terms/Constants_7_22" title="Referenced at ../Terms.sdf3 line 5">terms/Constants</a>

<span class="keyword">sorts</span> 

  <a href="../Terms.sdf3#Int_586_589" id="Int_34_37" title="Referenced at ../Terms.sdf3 line 34">Int</a> <a href="../Terms.sdf3#Real_609_613" id="Real_38_42" title="Referenced at ../Terms.sdf3 line 35">Real</a> <a href="../Signatures.sdf3#String_365_371" id="String_43_49" title="Referenced at ../Signatures.sdf3 line 24; ../Terms.sdf3 line 38">String</a> <a href="#StrChar_154_161" id="StrChar_50_57" title="Referenced at line 11">StrChar</a>

<span class="keyword">lexical syntax</span>

  <a href="../Terms.sdf3#Int_586_589" id="Int_77_80" title="Referenced at ../Terms.sdf3 line 34">Int</a>     = [\-]? [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+
  <a href="../Terms.sdf3#Real_609_613" id="Real_102_106" title="Referenced at ../Terms.sdf3 line 35">Real</a>    = [\-]? [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+ [\.] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+
  <a href="../Signatures.sdf3#String_365_371" id="String_139_145" title="Referenced at ../Signatures.sdf3 line 24; ../Terms.sdf3 line 38">String</a>  = <span class="cons_Lit">"\""</span> <a href="#StrChar_50_57" id="StrChar_154_161" title="Defined at line 5, 12, 13">StrChar</a>* <span class="cons_Lit">"\""</span>
  <a href="#StrChar_154_161" id="StrChar_170_177" title="Referenced at line 11">StrChar</a> = ~[\"\\]
  <a href="#StrChar_154_161" id="StrChar_190_197" title="Referenced at line 11">StrChar</a> = [\\] [\"<span class="cons_Regular">t</span><span class="cons_Regular">n</span><span class="cons_Regular">r</span>\\]

<span class="keyword">sorts</span> <a href="#Char_358_362" id="Char_222_226" title="Referenced at line 25; ../Terms.sdf3 line 39">Char</a> <a href="#CharChar_272_280" id="CharChar_227_235" title="Referenced at line 19">CharChar</a>

<span class="keyword">lexical syntax</span>
  
  <a href="#Char_358_362" id="Char_257_261" title="Referenced at line 25; ../Terms.sdf3 line 39">Char</a>     = <span class="cons_Lit">"'"</span> <a href="#CharChar_227_235" id="CharChar_272_280" title="Defined at line 15, 20, 21">CharChar</a> <span class="cons_Lit">"'"</span>
  <a href="#CharChar_272_280" id="CharChar_287_295" title="Referenced at line 19">CharChar</a> = ~[\']
  <a href="#CharChar_272_280" id="CharChar_306_314" title="Referenced at line 19">CharChar</a> = [\\] [\'<span class="cons_Regular">n</span><span class="cons_Regular">t</span><span class="cons_Regular">r</span>\ ]
  
<span class="keyword">lexical syntax</span>

  <span id="Id_353_355" title="Not referenced locally, nor via imports">Id</span> = <a href="#Char_222_226" id="Char_358_362" title="Defined at line 15, 19">Char</a> {<span class="keyword">reject</span>}

</code></pre></td></tr></tbody></table></div>