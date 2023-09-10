---
title: Layout.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../NameBindingLanguage.sdf3#common/Layout_40_53" id="common/Layout_7_20" title="Referenced at ../../NameBindingLanguage.sdf3 line 5">common/Layout</a>

<span class="keyword">sorts</span>

  <a href="#LongCom_157_164" id="LongCom_31_38" title="Referenced at line 12">LongCom</a> <a href="#CommChar_183_191" id="CommChar_39_47" title="Referenced at line 13">CommChar</a> <a href="#Asterisk_285_293" id="Asterisk_48_56" title="Referenced at line 20">Asterisk</a> <a href="#Eof_305_308" id="Eof_57_60" title="Referenced at line 21">Eof</a>

<span class="keyword">lexical syntax</span>

  <span class="keyword">LAYOUT</span> = [\t\ \n\r] 
  <span class="keyword">LAYOUT</span> = <span class="cons_Lit">"//"</span> ~[\n]* [\n] | <a href="#Eof_57_60" id="Eof_131_134" title="Defined at line 5, 11">Eof</a> 
  <a href="#Eof_305_308" id="Eof_138_141" title="Referenced at line 21">Eof</a> =  
  <span class="keyword">LAYOUT</span> = <a href="#LongCom_31_38" id="LongCom_157_164" title="Defined at line 5, 13">LongCom</a> 
  <a href="#LongCom_157_164" id="LongCom_168_175" title="Referenced at line 12">LongCom</a> = <span class="cons_Lit">"/*"</span> <a href="#CommChar_39_47" id="CommChar_183_191" title="Defined at line 5, 14, 15">CommChar</a>* <span class="cons_Lit">"*/"</span> 
  <a href="#CommChar_183_191" id="CommChar_201_209" title="Referenced at line 13">CommChar</a> = ~[\*] 
  <a href="#CommChar_183_191" id="CommChar_221_229" title="Referenced at line 13">CommChar</a> = <a href="#Asterisk_48_56" id="Asterisk_232_240" title="Defined at line 5, 16">Asterisk</a> 
  <a href="#Asterisk_285_293" id="Asterisk_244_252" title="Referenced at line 20">Asterisk</a> = <span class="cons_Lit">"*"</span> 

<span class="keyword">lexical restrictions</span>

  <a href="#Asterisk_48_56" id="Asterisk_285_293" title="Defined at line 5, 16">Asterisk</a> -/- [\/]
  <a href="#Eof_57_60" id="Eof_305_308" title="Defined at line 5, 11">Eof</a> -/- ~[]

<span class="keyword">context-free restrictions</span>

  <span class="keyword">LAYOUT</span>? -/- [\ \t\n\r]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\*]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\/]

</code></pre></td></tr></tbody></table></div>