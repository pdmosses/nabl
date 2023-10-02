---
title: Identifiers.sdf3
hide:
  - toc
---

# `Identifiers.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/lexical/Identifiers.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/lexical/Identifiers.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/lexical/Identifiers.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="lexical/Identifiers_7_26" title="Not referenced locally, nor via imports">lexical/Identifiers</span>

<span class="keyword">sorts</span> 

  <a href="#Id_428_430" id="Id_38_40" title="Referenced at line 23">Id</a> <a href="#LId_454_457" id="LId_41_44" title="Referenced at line 24">LId</a> <a href="#LCID_487_491" id="LCID_45_49" title="Referenced at line 25">LCID</a> <a href="#UCID_520_524" id="UCID_50_54" title="Referenced at line 26">UCID</a> <a href="#ModuleID_553_561" id="ModuleID_55_63" title="Referenced at line 27">ModuleID</a>

<span class="keyword">lexical syntax</span>

  <a href="#Id_428_430" id="Id_83_85" title="Referenced at line 23">Id</a>  = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]*    
  <a href="#Id_428_430" id="Id_125_127" title="Referenced at line 23">Id</a>  = <span class="cons_Lit">"_"</span> {<span class="keyword">reject</span>}
  <a href="#Id_428_430" id="Id_146_148" title="Referenced at line 23">Id</a>  = [\'] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>]+
  <a href="#LId_454_457" id="LId_166_169" title="Referenced at line 24">LId</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* <span class="cons_Lit">"*"</span>

  <a href="#LCID_487_491" id="LCID_209_213" title="Referenced at line 25">LCID</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]*
  <a href="#UCID_520_524" id="UCID_243_247" title="Referenced at line 26">UCID</a> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]*

  <a href="#ModuleID_553_561" id="ModuleID_278_286" title="Referenced at line 27">ModuleID</a>     = {<a href="#ModuleIDPart_316_328" id="ModuleIDPart_294_306" title="Defined at line 18">ModuleIDPart</a> <span class="cons_Lit">"/"</span>}+ 
  <a href="#ModuleIDPart_294_306" id="ModuleIDPart_316_328" title="Referenced at line 17">ModuleIDPart</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\.\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]* 
    
<span class="keyword">lexical restrictions</span>

  <a href="#Id_38_40" id="Id_395_397" title="Defined at line 5, 9, 10, 11">Id</a>       -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_\*]
  <a href="#Id_38_40" id="Id_428_430" title="Defined at line 5, 9, 10, 11">Id</a>       -/- [\-].~[\&gt;]
  <a href="#LId_41_44" id="LId_454_457" title="Defined at line 5, 12">LId</a>      -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#LCID_45_49" id="LCID_487_491" title="Defined at line 5, 14">LCID</a>     -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#UCID_50_54" id="UCID_520_524" title="Defined at line 5, 15">UCID</a>     -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#ModuleID_55_63" id="ModuleID_553_561" title="Defined at line 5, 17">ModuleID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]
  
</code></pre></td></tr></tbody></table></div>