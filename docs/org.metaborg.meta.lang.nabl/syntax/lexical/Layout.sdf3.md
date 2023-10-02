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
<td class="code"><pre><code><span class="keyword">module</span> <span id="lexical/Layout_7_21" title="Not referenced locally, nor via imports">lexical/Layout</span>

<span class="keyword">sorts</span> <a href="#LongCom_169_176" id="LongCom_29_36" title="Referenced at line 12">LongCom</a> <a href="#CommChar_195_203" id="CommChar_37_45" title="Referenced at line 13">CommChar</a> <a href="#Asterisk_295_303" id="Asterisk_46_54" title="Referenced at line 20">Asterisk</a> <a href="#Eof_315_318" id="Eof_55_58" title="Referenced at line 21">Eof</a> 

<span class="keyword">lexical syntax</span>

  <span class="keyword">LAYOUT</span>   = [\t\ \n\r] 

  <span class="keyword">LAYOUT</span>   =<span class="cons_Lit">"//"</span> ~[\n]* ([\n] | <a href="#Eof_55_58" id="Eof_135_138" title="Defined at line 3, 10">Eof</a>)
  <a href="#Eof_315_318" id="Eof_142_145" title="Referenced at line 21">Eof</a>      = 
 
  <span class="keyword">LAYOUT</span>   = <a href="#LongCom_29_36" id="LongCom_169_176" title="Defined at line 3, 13">LongCom</a>
  <a href="#LongCom_169_176" id="LongCom_179_186" title="Referenced at line 12">LongCom</a>  = <span class="cons_Lit">"/*"</span> <a href="#CommChar_37_45" id="CommChar_195_203" title="Defined at line 3, 14, 15">CommChar</a>* <span class="cons_Lit">"*/"</span>
  <a href="#CommChar_195_203" id="CommChar_212_220" title="Referenced at line 13">CommChar</a> = ~[\*]
  <a href="#CommChar_195_203" id="CommChar_231_239" title="Referenced at line 13">CommChar</a> = <a href="#Asterisk_46_54" id="Asterisk_242_250" title="Defined at line 3, 16">Asterisk</a>
  <a href="#Asterisk_295_303" id="Asterisk_253_261" title="Referenced at line 20">Asterisk</a> = <span class="cons_Lit">"*"</span>
  
<span class="keyword">lexical restrictions</span>

  <a href="#Asterisk_46_54" id="Asterisk_295_303" title="Defined at line 3, 16">Asterisk</a> -/- [\/]
  <a href="#Eof_55_58" id="Eof_315_318" title="Defined at line 3, 10">Eof</a>      -/- ~[]

<span class="keyword">context-free restrictions</span>

  <span class="keyword">LAYOUT</span>? -/- [\ \t\n\r]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\*]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\/]

</code></pre></td></tr></tbody></table></div>