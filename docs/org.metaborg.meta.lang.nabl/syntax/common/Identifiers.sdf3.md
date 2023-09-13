---
title: Identifiers.sdf3
---

# `Identifiers.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/common/Identifiers.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/common/Identifiers.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/common/Identifiers.sdf3 "The source file on GitHub"

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
28
29
30
31
32
33
34
35
36
37
38
39
40
41
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../terms/Vars.sdf3#common/Identifiers_31_49" id="common/Identifiers_7_25" title="Referenced at ../../terms/Vars.sdf3 line 5">common/Identifiers</a>

<span class="keyword">sorts</span>

  <a href="#Id_293_295" id="Id_36_38" title="Referenced at line 18; ../../core/Namespaces.sdf3 line 27; ../../core/Properties.sdf3 line 14; ../../core/Scopes.sdf3 line 11; ../../terms/Vars.sdf3 line 18">Id</a> <a href="#LId_313_316" id="LId_39_42" title="Referenced at line 19; ../../terms/Vars.sdf3 line 19">LId</a> <a href="#LCID_341_345" id="LCID_43_47" title="Referenced at line 20; ../../terms/Signatures.sdf3 line 14">LCID</a> <a href="#UCID_370_374" id="UCID_48_52" title="Referenced at line 21; ../../terms/Signatures.sdf3 line 15">UCID</a>

<span class="keyword">lexical syntax</span>

  <a href="#Id_293_295" id="Id_72_74" title="Referenced at line 18; ../../core/Namespaces.sdf3 line 27; ../../core/Properties.sdf3 line 14; ../../core/Scopes.sdf3 line 11; ../../terms/Vars.sdf3 line 18">Id</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* 
  <a href="#LId_313_316" id="LId_110_113" title="Referenced at line 19; ../../terms/Vars.sdf3 line 19">LId</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* <span class="cons_Lit">"*"</span> 
  <a href="#Id_293_295" id="Id_153_155" title="Referenced at line 18; ../../core/Namespaces.sdf3 line 27; ../../core/Properties.sdf3 line 14; ../../core/Scopes.sdf3 line 11; ../../terms/Vars.sdf3 line 18">Id</a> = [\'] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>]+ 
  <a href="#LCID_341_345" id="LCID_173_177" title="Referenced at line 20; ../../terms/Signatures.sdf3 line 14">LCID</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* 
  <a href="#UCID_370_374" id="UCID_208_212" title="Referenced at line 21; ../../terms/Signatures.sdf3 line 15">UCID</a> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* 

<span class="keyword">lexical restrictions</span>

  <a href="#Id_36_38" id="Id_266_268" title="Defined at line 5, 9, 11, 25, 26, 27">Id</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_\*]
  <a href="#Id_36_38" id="Id_293_295" title="Defined at line 5, 9, 11, 25, 26, 27">Id</a> -/- [\-].~[\&gt;]
  <a href="#LId_39_42" id="LId_313_316" title="Defined at line 5, 10, 28">LId</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#LCID_43_47" id="LCID_341_345" title="Defined at line 5, 12, 29">LCID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#UCID_48_52" id="UCID_370_374" title="Defined at line 5, 13, 30">UCID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]

<span class="keyword">lexical syntax</span>

  <a href="#Id_293_295" id="Id_416_418" title="Referenced at line 18; ../../core/Namespaces.sdf3 line 27; ../../core/Properties.sdf3 line 14; ../../core/Scopes.sdf3 line 11; ../../terms/Vars.sdf3 line 18">Id</a> = <span class="cons_Lit">"_"</span> {<span class="keyword">reject</span>}
  <a href="#Id_293_295" id="Id_436_438" title="Referenced at line 18; ../../core/Namespaces.sdf3 line 27; ../../core/Properties.sdf3 line 14; ../../core/Scopes.sdf3 line 11; ../../terms/Vars.sdf3 line 18">Id</a> = <span class="cons_Lit">"'"</span> {<span class="keyword">reject</span>}
  <a href="#Id_293_295" id="Id_456_458" title="Referenced at line 18; ../../core/Namespaces.sdf3 line 27; ../../core/Properties.sdf3 line 14; ../../core/Scopes.sdf3 line 11; ../../terms/Vars.sdf3 line 18">Id</a> = <a href="#Keyword_565_572" id="Keyword_461_468" title="Defined at line 34, 38, 39, 40, 41">Keyword</a> {<span class="keyword">reject</span>}
  <a href="#LId_313_316" id="LId_480_483" title="Referenced at line 19; ../../terms/Vars.sdf3 line 19">LId</a> = <a href="#Keyword_565_572" id="Keyword_486_493" title="Defined at line 34, 38, 39, 40, 41">Keyword</a> {<span class="keyword">reject</span>}
  <a href="#LCID_341_345" id="LCID_505_509" title="Referenced at line 20; ../../terms/Signatures.sdf3 line 14">LCID</a> = <a href="#Keyword_565_572" id="Keyword_512_519" title="Defined at line 34, 38, 39, 40, 41">Keyword</a> {<span class="keyword">reject</span>}
  <a href="#UCID_370_374" id="UCID_531_535" title="Referenced at line 21; ../../terms/Signatures.sdf3 line 15">UCID</a> = <a href="#Keyword_565_572" id="Keyword_538_545" title="Defined at line 34, 38, 39, 40, 41">Keyword</a> {<span class="keyword">reject</span>}

<span class="keyword">sorts</span>

  <a href="#Keyword_538_545" id="Keyword_565_572" title="Referenced at line 30">Keyword</a>

<span class="keyword">lexical syntax</span>

  <a href="#Keyword_538_545" id="Keyword_592_599" title="Referenced at line 30">Keyword</a> = <span class="cons_Lit">"module"</span> 
  <a href="#Keyword_538_545" id="Keyword_614_621" title="Referenced at line 30">Keyword</a> = <span class="cons_Lit">"rules"</span> 
  <a href="#Keyword_538_545" id="Keyword_635_642" title="Referenced at line 30">Keyword</a> = <span class="cons_Lit">"namespaces"</span> 
  <a href="#Keyword_538_545" id="Keyword_661_668" title="Referenced at line 30">Keyword</a> = <span class="cons_Lit">"properties"</span> 

</code></pre></td></tr></tbody></table></div>