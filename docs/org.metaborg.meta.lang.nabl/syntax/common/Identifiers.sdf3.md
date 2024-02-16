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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="common/Identifiers_1_8" title="a definition with multiple references" data-urls="../../NameBindingLanguage.sdf3/#common/Identifiers line 6_3; ../../core/Namespaces.sdf3/#common/Identifiers line 5_3; ../../core/Properties.sdf3/#common/Identifiers line 5_2; ../../core/Scopes.sdf3/#common/Identifiers line 5_2; ../../terms/Signatures.sdf3/#common/Identifiers line 5_2; ../../terms/Terms.sdf3/#common/Identifiers line 6_3; ../../terms/Vars.sdf3/#common/Identifiers line 5_3">common/Identifiers</button>

<span class="keyword">sorts</span>

  <button class="modal-open" id="Id_5_3" title="a definition with multiple references" data-urls="#Id line 17_3, 18_3; ../../core/Namespaces.sdf3/#Id line 10_17, 27_31; ../../core/Properties.sdf3/#Id line 14_16; ../../core/Scopes.sdf3/#Id line 11_13; ../../terms/Signatures.sdf3/#Id line 16_20, 22_24, 32_29; ../../terms/Terms.sdf3/#Id line 19_18, 37_15; ../../terms/Vars.sdf3/#Id line 16_13, 18_19">Id</button> <button class="modal-open" id="LId_5_6" title="a definition with multiple references" data-urls="#LId line 19_3; ../../terms/Vars.sdf3/#LId line 17_17, 19_23">LId</button> <button class="modal-open" id="LCID_5_10" title="a definition with multiple references" data-urls="#LCID line 20_3; ../../terms/Signatures.sdf3/#LCID line 14_20">LCID</button> <button class="modal-open" id="UCID_5_15" title="a definition with multiple references" data-urls="#UCID line 21_3; ../../terms/Signatures.sdf3/#UCID line 15_20">UCID</button>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="Id_9_3" title="a definition with multiple references" data-urls="#Id line 17_3, 18_3; ../../core/Namespaces.sdf3/#Id line 10_17, 27_31; ../../core/Properties.sdf3/#Id line 14_16; ../../core/Scopes.sdf3/#Id line 11_13; ../../terms/Signatures.sdf3/#Id line 16_20, 22_24, 32_29; ../../terms/Terms.sdf3/#Id line 19_18, 37_15; ../../terms/Vars.sdf3/#Id line 16_13, 18_19">Id</button> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* 
  <button class="modal-open" id="LId_10_3" title="a definition with multiple references" data-urls="#LId line 19_3; ../../terms/Vars.sdf3/#LId line 17_17, 19_23">LId</button> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* <span class="cons_Lit">"*"</span> 
  <button class="modal-open" id="Id_11_3" title="a definition with multiple references" data-urls="#Id line 17_3, 18_3; ../../core/Namespaces.sdf3/#Id line 10_17, 27_31; ../../core/Properties.sdf3/#Id line 14_16; ../../core/Scopes.sdf3/#Id line 11_13; ../../terms/Signatures.sdf3/#Id line 16_20, 22_24, 32_29; ../../terms/Terms.sdf3/#Id line 19_18, 37_15; ../../terms/Vars.sdf3/#Id line 16_13, 18_19">Id</button> = [\'] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>]+ 
  <button class="modal-open" id="LCID_12_3" title="a definition with multiple references" data-urls="#LCID line 20_3; ../../terms/Signatures.sdf3/#LCID line 14_20">LCID</button> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* 
  <button class="modal-open" id="UCID_13_3" title="a definition with multiple references" data-urls="#UCID line 21_3; ../../terms/Signatures.sdf3/#UCID line 15_20">UCID</button> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* 

<span class="keyword">lexical restrictions</span>

  <a href="#Id_5_3" id="Id_17_3" title="a reference to a single-file definition">Id</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_\*]
  <a href="#Id_5_3" id="Id_18_3" title="a reference to a single-file definition">Id</a> -/- [\-].~[\&gt;]
  <a href="#LId_5_6" id="LId_19_3" title="a reference to a single-file definition">LId</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#LCID_5_10" id="LCID_20_3" title="a reference to a single-file definition">LCID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#UCID_5_15" id="UCID_21_3" title="a reference to a single-file definition">UCID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="Id_25_3" title="a definition with multiple references" data-urls="#Id line 17_3, 18_3; ../../core/Namespaces.sdf3/#Id line 10_17, 27_31; ../../core/Properties.sdf3/#Id line 14_16; ../../core/Scopes.sdf3/#Id line 11_13; ../../terms/Signatures.sdf3/#Id line 16_20, 22_24, 32_29; ../../terms/Terms.sdf3/#Id line 19_18, 37_15; ../../terms/Vars.sdf3/#Id line 16_13, 18_19">Id</button> = <span class="cons_Lit">"_"</span> {<span class="keyword">reject</span>}
  <button class="modal-open" id="Id_26_3" title="a definition with multiple references" data-urls="#Id line 17_3, 18_3; ../../core/Namespaces.sdf3/#Id line 10_17, 27_31; ../../core/Properties.sdf3/#Id line 14_16; ../../core/Scopes.sdf3/#Id line 11_13; ../../terms/Signatures.sdf3/#Id line 16_20, 22_24, 32_29; ../../terms/Terms.sdf3/#Id line 19_18, 37_15; ../../terms/Vars.sdf3/#Id line 16_13, 18_19">Id</button> = <span class="cons_Lit">"'"</span> {<span class="keyword">reject</span>}
  <button class="modal-open" id="Id_27_3" title="a definition with multiple references" data-urls="#Id line 17_3, 18_3; ../../core/Namespaces.sdf3/#Id line 10_17, 27_31; ../../core/Properties.sdf3/#Id line 14_16; ../../core/Scopes.sdf3/#Id line 11_13; ../../terms/Signatures.sdf3/#Id line 16_20, 22_24, 32_29; ../../terms/Terms.sdf3/#Id line 19_18, 37_15; ../../terms/Vars.sdf3/#Id line 16_13, 18_19">Id</button> = <a href="#Keyword_34_3" id="Keyword_27_8" title="a reference to a single-file definition">Keyword</a> {<span class="keyword">reject</span>}
  <button class="modal-open" id="LId_28_3" title="a definition with multiple references" data-urls="#LId line 19_3; ../../terms/Vars.sdf3/#LId line 17_17, 19_23">LId</button> = <a href="#Keyword_34_3" id="Keyword_28_9" title="a reference to a single-file definition">Keyword</a> {<span class="keyword">reject</span>}
  <button class="modal-open" id="LCID_29_3" title="a definition with multiple references" data-urls="#LCID line 20_3; ../../terms/Signatures.sdf3/#LCID line 14_20">LCID</button> = <a href="#Keyword_34_3" id="Keyword_29_10" title="a reference to a single-file definition">Keyword</a> {<span class="keyword">reject</span>}
  <button class="modal-open" id="UCID_30_3" title="a definition with multiple references" data-urls="#UCID line 21_3; ../../terms/Signatures.sdf3/#UCID line 15_20">UCID</button> = <a href="#Keyword_34_3" id="Keyword_30_10" title="a reference to a single-file definition">Keyword</a> {<span class="keyword">reject</span>}

<span class="keyword">sorts</span>

  <button class="modal-open" id="Keyword_34_3" title="a definition with multiple references" data-urls="#Keyword line 27_8, 28_9, 29_10, 30_10">Keyword</button>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="Keyword_38_3" title="a definition with multiple references" data-urls="#Keyword line 27_8, 28_9, 29_10, 30_10">Keyword</button> = <span class="cons_Lit">"module"</span> 
  <button class="modal-open" id="Keyword_39_3" title="a definition with multiple references" data-urls="#Keyword line 27_8, 28_9, 29_10, 30_10">Keyword</button> = <span class="cons_Lit">"rules"</span> 
  <button class="modal-open" id="Keyword_40_3" title="a definition with multiple references" data-urls="#Keyword line 27_8, 28_9, 29_10, 30_10">Keyword</button> = <span class="cons_Lit">"namespaces"</span> 
  <button class="modal-open" id="Keyword_41_3" title="a definition with multiple references" data-urls="#Keyword line 27_8, 28_9, 29_10, 30_10">Keyword</button> = <span class="cons_Lit">"properties"</span> 

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
