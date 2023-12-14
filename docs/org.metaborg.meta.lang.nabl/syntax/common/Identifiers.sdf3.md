---
title: Identifiers.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="common/Identifiers_1_8" title="Multi-file references" data-urls="../../NameBindingLanguage.sdf3/#common/Identifiers_6_3 line 6; ../../core/Namespaces.sdf3/#common/Identifiers_5_3 line 5; ../../core/Properties.sdf3/#common/Identifiers_5_2 line 5; ../../core/Scopes.sdf3/#common/Identifiers_5_2 line 5; ../../terms/Signatures.sdf3/#common/Identifiers_5_2 line 5; ../../terms/Terms.sdf3/#common/Identifiers_6_3 line 6; ../../terms/Vars.sdf3/#common/Identifiers_5_3 line 5">common/Identifiers</button>

<span class="keyword">sorts</span>

  <button class="modal-open" id="Id_5_3" title="Multi-file references" data-urls="#Id_17_3 line 17, 18; ../../core/Namespaces.sdf3/#Id_10_17 line 10, 27; ../../core/Properties.sdf3/#Id_14_16 line 14; ../../core/Scopes.sdf3/#Id_11_13 line 11; ../../terms/Signatures.sdf3/#Id_16_20 line 16, 22, 32; ../../terms/Terms.sdf3/#Id_19_18 line 19, 37; ../../terms/Vars.sdf3/#Id_16_13 line 16, 18">Id</button> <button class="modal-open" id="LId_5_6" title="Multi-file references" data-urls="#LId_19_3 line 19; ../../terms/Vars.sdf3/#LId_17_17 line 17, 19">LId</button> <button class="modal-open" id="LCID_5_10" title="Multi-file references" data-urls="#LCID_20_3 line 20; ../../terms/Signatures.sdf3/#LCID_14_20 line 14">LCID</button> <button class="modal-open" id="UCID_5_15" title="Multi-file references" data-urls="#UCID_21_3 line 21; ../../terms/Signatures.sdf3/#UCID_15_20 line 15">UCID</button>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="Id_9_3" title="Multi-file references" data-urls="#Id_17_3 line 17, 18; ../../core/Namespaces.sdf3/#Id_10_17 line 10, 27; ../../core/Properties.sdf3/#Id_14_16 line 14; ../../core/Scopes.sdf3/#Id_11_13 line 11; ../../terms/Signatures.sdf3/#Id_16_20 line 16, 22, 32; ../../terms/Terms.sdf3/#Id_19_18 line 19, 37; ../../terms/Vars.sdf3/#Id_16_13 line 16, 18">Id</button> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* 
  <button class="modal-open" id="LId_10_3" title="Multi-file references" data-urls="#LId_19_3 line 19; ../../terms/Vars.sdf3/#LId_17_17 line 17, 19">LId</button> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* <span class="cons_Lit">"*"</span> 
  <button class="modal-open" id="Id_11_3" title="Multi-file references" data-urls="#Id_17_3 line 17, 18; ../../core/Namespaces.sdf3/#Id_10_17 line 10, 27; ../../core/Properties.sdf3/#Id_14_16 line 14; ../../core/Scopes.sdf3/#Id_11_13 line 11; ../../terms/Signatures.sdf3/#Id_16_20 line 16, 22, 32; ../../terms/Terms.sdf3/#Id_19_18 line 19, 37; ../../terms/Vars.sdf3/#Id_16_13 line 16, 18">Id</button> = [\'] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>]+ 
  <button class="modal-open" id="LCID_12_3" title="Multi-file references" data-urls="#LCID_20_3 line 20; ../../terms/Signatures.sdf3/#LCID_14_20 line 14">LCID</button> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* 
  <button class="modal-open" id="UCID_13_3" title="Multi-file references" data-urls="#UCID_21_3 line 21; ../../terms/Signatures.sdf3/#UCID_15_20 line 15">UCID</button> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* 

<span class="keyword">lexical restrictions</span>

  <a href="#Id_5_3" id="Id_17_3" title="Defined at line 5, 9, 11, 25, 26, 27">Id</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_\*]
  <a href="#Id_5_3" id="Id_18_3" title="Defined at line 5, 9, 11, 25, 26, 27">Id</a> -/- [\-].~[\&gt;]
  <a href="#LId_5_6" id="LId_19_3" title="Defined at line 5, 10, 28">LId</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#LCID_5_10" id="LCID_20_3" title="Defined at line 5, 12, 29">LCID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#UCID_5_15" id="UCID_21_3" title="Defined at line 5, 13, 30">UCID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="Id_25_3" title="Multi-file references" data-urls="#Id_17_3 line 17, 18; ../../core/Namespaces.sdf3/#Id_10_17 line 10, 27; ../../core/Properties.sdf3/#Id_14_16 line 14; ../../core/Scopes.sdf3/#Id_11_13 line 11; ../../terms/Signatures.sdf3/#Id_16_20 line 16, 22, 32; ../../terms/Terms.sdf3/#Id_19_18 line 19, 37; ../../terms/Vars.sdf3/#Id_16_13 line 16, 18">Id</button> = <span class="cons_Lit">"_"</span> {<span class="keyword">reject</span>}
  <button class="modal-open" id="Id_26_3" title="Multi-file references" data-urls="#Id_17_3 line 17, 18; ../../core/Namespaces.sdf3/#Id_10_17 line 10, 27; ../../core/Properties.sdf3/#Id_14_16 line 14; ../../core/Scopes.sdf3/#Id_11_13 line 11; ../../terms/Signatures.sdf3/#Id_16_20 line 16, 22, 32; ../../terms/Terms.sdf3/#Id_19_18 line 19, 37; ../../terms/Vars.sdf3/#Id_16_13 line 16, 18">Id</button> = <span class="cons_Lit">"'"</span> {<span class="keyword">reject</span>}
  <button class="modal-open" id="Id_27_3" title="Multi-file references" data-urls="#Id_17_3 line 17, 18; ../../core/Namespaces.sdf3/#Id_10_17 line 10, 27; ../../core/Properties.sdf3/#Id_14_16 line 14; ../../core/Scopes.sdf3/#Id_11_13 line 11; ../../terms/Signatures.sdf3/#Id_16_20 line 16, 22, 32; ../../terms/Terms.sdf3/#Id_19_18 line 19, 37; ../../terms/Vars.sdf3/#Id_16_13 line 16, 18">Id</button> = <a href="#Keyword_34_3" id="Keyword_27_8" title="Defined at line 34, 38, 39, 40, 41">Keyword</a> {<span class="keyword">reject</span>}
  <button class="modal-open" id="LId_28_3" title="Multi-file references" data-urls="#LId_19_3 line 19; ../../terms/Vars.sdf3/#LId_17_17 line 17, 19">LId</button> = <a href="#Keyword_34_3" id="Keyword_28_9" title="Defined at line 34, 38, 39, 40, 41">Keyword</a> {<span class="keyword">reject</span>}
  <button class="modal-open" id="LCID_29_3" title="Multi-file references" data-urls="#LCID_20_3 line 20; ../../terms/Signatures.sdf3/#LCID_14_20 line 14">LCID</button> = <a href="#Keyword_34_3" id="Keyword_29_10" title="Defined at line 34, 38, 39, 40, 41">Keyword</a> {<span class="keyword">reject</span>}
  <button class="modal-open" id="UCID_30_3" title="Multi-file references" data-urls="#UCID_21_3 line 21; ../../terms/Signatures.sdf3/#UCID_15_20 line 15">UCID</button> = <a href="#Keyword_34_3" id="Keyword_30_10" title="Defined at line 34, 38, 39, 40, 41">Keyword</a> {<span class="keyword">reject</span>}

<span class="keyword">sorts</span>

  <a href="#Keyword_27_8" id="Keyword_34_3" title="Referenced at line 27, 28, 29, 30">Keyword</a>

<span class="keyword">lexical syntax</span>

  <a href="#Keyword_27_8" id="Keyword_38_3" title="Referenced at line 27, 28, 29, 30">Keyword</a> = <span class="cons_Lit">"module"</span> 
  <a href="#Keyword_27_8" id="Keyword_39_3" title="Referenced at line 27, 28, 29, 30">Keyword</a> = <span class="cons_Lit">"rules"</span> 
  <a href="#Keyword_27_8" id="Keyword_40_3" title="Referenced at line 27, 28, 29, 30">Keyword</a> = <span class="cons_Lit">"namespaces"</span> 
  <a href="#Keyword_27_8" id="Keyword_41_3" title="Referenced at line 27, 28, 29, 30">Keyword</a> = <span class="cons_Lit">"properties"</span> 

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
