---
title: Signatures.sdf3
hide:
  - toc
---

# `Signatures.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/terms/Signatures.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/terms/Signatures.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/terms/Signatures.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="terms/Signatures_1_8" title="a definition with multiple references" data-urls="../../NameBindingLanguage.sdf3/#terms/Signatures line 7_3; ../../core/Properties.sdf3/#terms/Signatures line 6_2">terms/Signatures</button>

<span class="keyword">imports</span>

        <a href="../../common/Identifiers.sdf3/#common/Identifiers_1_8" id="common/Identifiers_5_2" title="a reference to a single-file definition">common/Identifiers</a>
        <a href="../Constants.sdf3/#terms/Constants_1_8" id="terms/Constants_6_2" title="a reference to a single-file definition">terms/Constants</a>
        
<span class="keyword">sorts</span> 

  <button class="modal-open" id="Sort_10_3" title="a definition with multiple references" data-urls="#Sort line 16_28, 32_36, 40_2; ../../core/Properties.sdf3/#Sort line 30_47">Sort</button>

<span class="keyword">context-free syntax</span>
        
        <button class="modal-open" id="Sort_14_2" title="a definition with multiple references" data-urls="#Sort line 16_28, 32_36, 40_2; ../../core/Properties.sdf3/#Sort line 30_47">Sort</button>.<span class="cons_Constructor"><span id="SortVar_14_7" title="a definition with no references">SortVar</span></span>    = <a href="../../common/Identifiers.sdf3/#LCID_5_10" id="LCID_14_20" title="a reference to a single-file definition">LCID</a>
        <button class="modal-open" id="Sort_15_2" title="a definition with multiple references" data-urls="#Sort line 16_28, 32_36, 40_2; ../../core/Properties.sdf3/#Sort line 30_47">Sort</button>.<span class="cons_Constructor"><span id="SortNoArgs_15_7" title="a definition with no references">SortNoArgs</span></span> = <a href="../../common/Identifiers.sdf3/#UCID_5_15" id="UCID_15_20" title="a reference to a single-file definition">UCID</a>
        <button class="modal-open" id="Sort_16_2" title="a definition with multiple references" data-urls="#Sort line 16_28, 32_36, 40_2; ../../core/Properties.sdf3/#Sort line 30_47">Sort</button>.<span class="cons_Constructor"><span id="Sort_16_7" title="a definition with no references">Sort</span></span>       = <a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_16_20" title="a reference to a single-file definition">Id</a> <span class="cons_Lit">"("</span> {<a href="#Sort_10_3" id="Sort_16_28" title="a reference to a single-file definition">Sort</a> <span class="cons_Lit">","</span>}* <span class="cons_Lit">")"</span>

<span class="keyword">sorts</span> <span id="TypeDecl_18_7" title="a definition with no references">TypeDecl</span> <button class="modal-open" id="PPTerm_18_16" title="a definition with multiple references" data-urls="#PPTerm line 22_42, 23_42">PPTerm</button>

<span class="keyword">context-free syntax</span>

  <span id="TypeDecl_22_3" title="a definition with no references">TypeDecl</span>.<span class="cons_Constructor"><span id="TypeDecl_22_12" title="a definition with no references">TypeDecl</span></span>  = <a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_22_24" title="a reference to a single-file definition">Id</a>     <a href="#TypeParams_26_7" id="TypeParams_22_31" title="a reference to a single-file definition">TypeParams</a> <a href="#PPTerm_18_16" id="PPTerm_22_42" title="a reference to a single-file definition">PPTerm</a>
  <span id="TypeDecl_23_3" title="a definition with no references">TypeDecl</span>.<span class="cons_Constructor"><span id="TypeDeclQ_23_12" title="a definition with no references">TypeDeclQ</span></span> = <a href="../Constants.sdf3/#String_5_12" id="String_23_24" title="a reference to a single-file definition">String</a> <a href="#TypeParams_26_7" id="TypeParams_23_31" title="a reference to a single-file definition">TypeParams</a> <a href="#PPTerm_18_16" id="PPTerm_23_42" title="a reference to a single-file definition">PPTerm</a>
  <button class="modal-open" id="PPTerm_24_3" title="a definition with multiple references" data-urls="#PPTerm line 22_42, 23_42">PPTerm</button>.<span class="cons_Constructor"><span id="Str_24_10" title="a definition with no references">Str</span></span>         = <a href="../Constants.sdf3/#String_5_12" id="String_24_24" title="a reference to a single-file definition">String</a>
  
<span class="keyword">sorts</span> <button class="modal-open" id="TypeParams_26_7" title="a definition with multiple references" data-urls="#TypeParams line 22_31, 23_31">TypeParams</button> <a href="#TypeParam_31_34" id="TypeParam_26_18" title="a definition with a single reference">TypeParam</a> 

<span class="keyword">context-free syntax</span>
        
  <button class="modal-open" id="TypeParams_30_3" title="a definition with multiple references" data-urls="#TypeParams line 22_31, 23_31">TypeParams</button>.<span class="cons_Constructor"><span id="NoTypeParams_30_14" title="a definition with no references">NoTypeParams</span></span> =
  <button class="modal-open" id="TypeParams_31_3" title="a definition with multiple references" data-urls="#TypeParams line 22_31, 23_31">TypeParams</button>.<span class="cons_Constructor"><span id="TypeParams_31_14" title="a definition with no references">TypeParams</span></span>   = <span class="cons_Lit">"("</span> {<a href="#TypeParam_26_18" id="TypeParam_31_34" title="a reference to a single-file definition">TypeParam</a> <span class="cons_Lit">","</span>}+ <span class="cons_Lit">")"</span>
  <a href="#TypeParam_31_34" id="TypeParam_32_3" title="a definition with a single reference">TypeParam</a>.<span class="cons_Constructor"><span id="TypeParam_32_13" title="a definition with no references">TypeParam</span></span>     = <a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_32_29" title="a reference to a single-file definition">Id</a> <span class="cons_Lit">":"</span> <a href="#Sort_10_3" id="Sort_32_36" title="a reference to a single-file definition">Sort</a>
  
<span class="layout">%%%</span>
<span class="layout">%% Restriction is required for the Sort* in Sdecl: List(a) is</span>
<span class="layout">%% ambiguous.</span>
<span class="layout">%%%</span>
<span class="keyword">context-free restrictions</span>

        <a href="#Sort_10_3" id="Sort_40_2" title="a reference to a single-file definition">Sort</a> -/- [\(]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
