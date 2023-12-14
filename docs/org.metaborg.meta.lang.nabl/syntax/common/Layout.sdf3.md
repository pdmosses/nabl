---
title: Layout.sdf3
hide:
  - toc
---

# `Layout.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/common/Layout.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/common/Layout.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/common/Layout.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../NameBindingLanguage.sdf3/#common/Layout_5_3" id="common/Layout_1_8" title="Referenced at ../../NameBindingLanguage.sdf3 line 5">common/Layout</a>

<span class="keyword">sorts</span>

  <a href="#LongCom_12_12" id="LongCom_5_3" title="Referenced at line 12">LongCom</a> <a href="#CommChar_13_18" id="CommChar_5_11" title="Referenced at line 13">CommChar</a> <a href="#Asterisk_15_14" id="Asterisk_5_20" title="Referenced at line 15, 20">Asterisk</a> <a href="#Eof_10_31" id="Eof_5_29" title="Referenced at line 10, 21">Eof</a>

<span class="keyword">lexical syntax</span>

  <span class="keyword">LAYOUT</span> = [\t\ \n\r] 
  <span class="keyword">LAYOUT</span> = <span class="cons_Lit">"//"</span> ~[\n]* [\n] | <a href="#Eof_5_29" id="Eof_10_31" title="Defined at line 5, 11">Eof</a> 
  <a href="#Eof_10_31" id="Eof_11_3" title="Referenced at line 10, 21">Eof</a> =  
  <span class="keyword">LAYOUT</span> = <a href="#LongCom_5_3" id="LongCom_12_12" title="Defined at line 5, 13">LongCom</a> 
  <a href="#LongCom_12_12" id="LongCom_13_3" title="Referenced at line 12">LongCom</a> = <span class="cons_Lit">"/*"</span> <a href="#CommChar_5_11" id="CommChar_13_18" title="Defined at line 5, 14, 15">CommChar</a>* <span class="cons_Lit">"*/"</span> 
  <a href="#CommChar_13_18" id="CommChar_14_3" title="Referenced at line 13">CommChar</a> = ~[\*] 
  <a href="#CommChar_13_18" id="CommChar_15_3" title="Referenced at line 13">CommChar</a> = <a href="#Asterisk_5_20" id="Asterisk_15_14" title="Defined at line 5, 16">Asterisk</a> 
  <a href="#Asterisk_15_14" id="Asterisk_16_3" title="Referenced at line 15, 20">Asterisk</a> = <span class="cons_Lit">"*"</span> 

<span class="keyword">lexical restrictions</span>

  <a href="#Asterisk_5_20" id="Asterisk_20_3" title="Defined at line 5, 16">Asterisk</a> -/- [\/]
  <a href="#Eof_5_29" id="Eof_21_3" title="Defined at line 5, 11">Eof</a> -/- ~[]

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
