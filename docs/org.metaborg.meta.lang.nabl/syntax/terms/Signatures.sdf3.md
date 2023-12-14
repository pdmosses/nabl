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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="terms/Signatures_1_8" title="Multi-file references" data-urls="../../NameBindingLanguage.sdf3/#terms/Signatures_7_3 line 7; ../../core/Properties.sdf3/#terms/Signatures_6_2 line 6">terms/Signatures</button>

<span class="keyword">imports</span>

        <a href="../../common/Identifiers.sdf3/#common/Identifiers_1_8" id="common/Identifiers_5_2" title="Defined at ../../common/Identifiers.sdf3 line 1">common/Identifiers</a>
        <a href="../Constants.sdf3/#terms/Constants_1_8" id="terms/Constants_6_2" title="Defined at ../Constants.sdf3 line 1">terms/Constants</a>
        
<span class="keyword">sorts</span> 

  <button class="modal-open" id="Sort_10_3" title="Multi-file references" data-urls="#Sort_16_28 line 16, 32, 40; ../../core/Properties.sdf3/#Sort_30_47 line 30">Sort</button>

<span class="keyword">context-free syntax</span>
        
        <button class="modal-open" id="Sort_14_2" title="Multi-file references" data-urls="#Sort_16_28 line 16, 32, 40; ../../core/Properties.sdf3/#Sort_30_47 line 30">Sort</button>.<span class="cons_Constructor"><span id="SortVar_14_7" title="Not referenced">SortVar</span></span>    = <a href="../../common/Identifiers.sdf3/#LCID_5_10" id="LCID_14_20" title="Defined at ../../common/Identifiers.sdf3 line 5, 12, 29">LCID</a>
        <button class="modal-open" id="Sort_15_2" title="Multi-file references" data-urls="#Sort_16_28 line 16, 32, 40; ../../core/Properties.sdf3/#Sort_30_47 line 30">Sort</button>.<span class="cons_Constructor"><span id="SortNoArgs_15_7" title="Not referenced">SortNoArgs</span></span> = <a href="../../common/Identifiers.sdf3/#UCID_5_15" id="UCID_15_20" title="Defined at ../../common/Identifiers.sdf3 line 5, 13, 30">UCID</a>
        <button class="modal-open" id="Sort_16_2" title="Multi-file references" data-urls="#Sort_16_28 line 16, 32, 40; ../../core/Properties.sdf3/#Sort_30_47 line 30">Sort</button>.<span class="cons_Constructor"><span id="Sort_16_7" title="Not referenced">Sort</span></span>       = <a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_16_20" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a> <span class="cons_Lit">"("</span> {<a href="#Sort_10_3" id="Sort_16_28" title="Defined at line 10, 14, 15, 16">Sort</a> <span class="cons_Lit">","</span>}* <span class="cons_Lit">")"</span>

<span class="keyword">sorts</span> <span id="TypeDecl_18_7" title="Not referenced">TypeDecl</span> <a href="#PPTerm_22_42" id="PPTerm_18_16" title="Referenced at line 22, 23">PPTerm</a>

<span class="keyword">context-free syntax</span>

  <span id="TypeDecl_22_3" title="Not referenced">TypeDecl</span>.<span class="cons_Constructor"><span id="TypeDecl_22_12" title="Not referenced">TypeDecl</span></span>  = <a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_22_24" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a>     <a href="#TypeParams_26_7" id="TypeParams_22_31" title="Defined at line 26, 30, 31">TypeParams</a> <a href="#PPTerm_18_16" id="PPTerm_22_42" title="Defined at line 18, 24">PPTerm</a>
  <span id="TypeDecl_23_3" title="Not referenced">TypeDecl</span>.<span class="cons_Constructor"><span id="TypeDeclQ_23_12" title="Not referenced">TypeDeclQ</span></span> = <a href="../Constants.sdf3/#String_5_12" id="String_23_24" title="Defined at ../Constants.sdf3 line 5, 11">String</a> <a href="#TypeParams_26_7" id="TypeParams_23_31" title="Defined at line 26, 30, 31">TypeParams</a> <a href="#PPTerm_18_16" id="PPTerm_23_42" title="Defined at line 18, 24">PPTerm</a>
  <a href="#PPTerm_22_42" id="PPTerm_24_3" title="Referenced at line 22, 23">PPTerm</a>.<span class="cons_Constructor"><span id="Str_24_10" title="Not referenced">Str</span></span>         = <a href="../Constants.sdf3/#String_5_12" id="String_24_24" title="Defined at ../Constants.sdf3 line 5, 11">String</a>
  
<span class="keyword">sorts</span> <a href="#TypeParams_22_31" id="TypeParams_26_7" title="Referenced at line 22, 23">TypeParams</a> <a href="#TypeParam_31_34" id="TypeParam_26_18" title="Referenced at line 31">TypeParam</a> 

<span class="keyword">context-free syntax</span>
        
  <a href="#TypeParams_22_31" id="TypeParams_30_3" title="Referenced at line 22, 23">TypeParams</a>.<span class="cons_Constructor"><span id="NoTypeParams_30_14" title="Not referenced">NoTypeParams</span></span> =
  <a href="#TypeParams_22_31" id="TypeParams_31_3" title="Referenced at line 22, 23">TypeParams</a>.<span class="cons_Constructor"><span id="TypeParams_31_14" title="Not referenced">TypeParams</span></span>   = <span class="cons_Lit">"("</span> {<a href="#TypeParam_26_18" id="TypeParam_31_34" title="Defined at line 26, 32">TypeParam</a> <span class="cons_Lit">","</span>}+ <span class="cons_Lit">")"</span>
  <a href="#TypeParam_31_34" id="TypeParam_32_3" title="Referenced at line 31">TypeParam</a>.<span class="cons_Constructor"><span id="TypeParam_32_13" title="Not referenced">TypeParam</span></span>     = <a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_32_29" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a> <span class="cons_Lit">":"</span> <a href="#Sort_10_3" id="Sort_32_36" title="Defined at line 10, 14, 15, 16">Sort</a>
  
<span class="layout">%%%</span>
<span class="layout">%% Restriction is required for the Sort* in Sdecl: List(a) is</span>
<span class="layout">%% ambiguous.</span>
<span class="layout">%%%</span>
<span class="keyword">context-free restrictions</span>

        <a href="#Sort_10_3" id="Sort_40_2" title="Defined at line 10, 14, 15, 16">Sort</a> -/- [\(]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
