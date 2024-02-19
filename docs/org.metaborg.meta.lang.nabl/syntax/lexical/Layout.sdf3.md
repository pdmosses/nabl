---
title: Layout.sdf3
hide:
  - toc
---

# `Layout.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/lexical/Layout.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/lexical/Layout.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/lexical/Layout.sdf3 "The source file on GitHub"

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
26
27
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="lexical/Layout_1_8" title="a definition with no references">lexical/Layout</span>

<span class="keyword">sorts</span> <a href="#LongCom_12_14" id="LongCom_3_7" title="a definition with a single reference">LongCom</a> <a href="#CommChar_13_19" id="CommChar_3_15" title="a definition with a single reference">CommChar</a> <button class="modal-open" id="Asterisk_3_24" title="a definition with multiple references" data-urls="#Asterisk line 15_14, 20_3">Asterisk</button> <button class="modal-open" id="Eof_3_33" title="a definition with multiple references" data-urls="#Eof line 9_33, 21_3">Eof</button> 

<span class="keyword">lexical syntax</span>

  <span class="keyword">LAYOUT</span>   = [\t\ \n\r] 

  <span class="keyword">LAYOUT</span>   =<span class="cons_Lit">"//"</span> ~[\n]* ([\n] | <a href="#Eof_3_33" id="Eof_9_33" title="a reference to a single-file definition">Eof</a>)
  <button class="modal-open" id="Eof_10_3" title="a definition with multiple references" data-urls="#Eof line 9_33, 21_3">Eof</button>      = 
 
  <span class="keyword">LAYOUT</span>   = <a href="#LongCom_3_7" id="LongCom_12_14" title="a reference to a single-file definition">LongCom</a>
  <a href="#LongCom_12_14" id="LongCom_13_3" title="a definition with a single reference">LongCom</a>  = <span class="cons_Lit">"/*"</span> <a href="#CommChar_3_15" id="CommChar_13_19" title="a reference to a single-file definition">CommChar</a>* <span class="cons_Lit">"*/"</span>
  <a href="#CommChar_13_19" id="CommChar_14_3" title="a definition with a single reference">CommChar</a> = ~[\*]
  <a href="#CommChar_13_19" id="CommChar_15_3" title="a definition with a single reference">CommChar</a> = <a href="#Asterisk_3_24" id="Asterisk_15_14" title="a reference to a single-file definition">Asterisk</a>
  <button class="modal-open" id="Asterisk_16_3" title="a definition with multiple references" data-urls="#Asterisk line 15_14, 20_3">Asterisk</button> = <span class="cons_Lit">"*"</span>
  
<span class="keyword">lexical restrictions</span>

  <a href="#Asterisk_3_24" id="Asterisk_20_3" title="a reference to a single-file definition">Asterisk</a> -/- [\/]
  <a href="#Eof_3_33" id="Eof_21_3" title="a reference to a single-file definition">Eof</a>      -/- ~[]

<span class="keyword">context-free restrictions</span>

  <span class="keyword">LAYOUT</span>? -/- [\ \t\n\r]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\*]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\/]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
