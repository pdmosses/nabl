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
<td class="code"><pre><code><span class="keyword">module</span> <span id="lexical/Identifiers_1_8" title="a definition with no references">lexical/Identifiers</span>

<span class="keyword">sorts</span> 

  <button class="modal-open" id="Id_5_3" title="a definition with multiple references" data-urls="#Id line 22_3, 23_3">Id</button> <a href="#LId_24_3" id="LId_5_6" title="a definition with a single reference">LId</a> <a href="#LCID_25_3" id="LCID_5_10" title="a definition with a single reference">LCID</a> <a href="#UCID_26_3" id="UCID_5_15" title="a definition with a single reference">UCID</a> <a href="#ModuleID_27_3" id="ModuleID_5_20" title="a definition with a single reference">ModuleID</a>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="Id_9_3" title="a definition with multiple references" data-urls="#Id line 22_3, 23_3">Id</button>  = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]*    
  <button class="modal-open" id="Id_10_3" title="a definition with multiple references" data-urls="#Id line 22_3, 23_3">Id</button>  = <span class="cons_Lit">"_"</span> {<span class="keyword">reject</span>}
  <button class="modal-open" id="Id_11_3" title="a definition with multiple references" data-urls="#Id line 22_3, 23_3">Id</button>  = [\'] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>]+
  <a href="#LId_24_3" id="LId_12_3" title="a definition with a single reference">LId</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* <span class="cons_Lit">"*"</span>

  <a href="#LCID_25_3" id="LCID_14_3" title="a definition with a single reference">LCID</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]*
  <a href="#UCID_26_3" id="UCID_15_3" title="a definition with a single reference">UCID</a> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]*

  <a href="#ModuleID_27_3" id="ModuleID_17_3" title="a definition with a single reference">ModuleID</a>     = {<a href="#ModuleIDPart_18_3" id="ModuleIDPart_17_19" title="a reference to a single-file definition">ModuleIDPart</a> <span class="cons_Lit">"/"</span>}+ 
  <a href="#ModuleIDPart_17_19" id="ModuleIDPart_18_3" title="a definition with a single reference">ModuleIDPart</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\.\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]* 
    
<span class="keyword">lexical restrictions</span>

  <a href="#Id_5_3" id="Id_22_3" title="a reference to a single-file definition">Id</a>       -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_\*]
  <a href="#Id_5_3" id="Id_23_3" title="a reference to a single-file definition">Id</a>       -/- [\-].~[\&gt;]
  <a href="#LId_5_6" id="LId_24_3" title="a reference to a single-file definition">LId</a>      -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#LCID_5_10" id="LCID_25_3" title="a reference to a single-file definition">LCID</a>     -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#UCID_5_15" id="UCID_26_3" title="a reference to a single-file definition">UCID</a>     -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#ModuleID_5_20" id="ModuleID_27_3" title="a reference to a single-file definition">ModuleID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]
  
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
