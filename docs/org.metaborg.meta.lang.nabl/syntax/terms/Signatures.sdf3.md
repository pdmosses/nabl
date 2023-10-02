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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../core/Properties.sdf3#terms/Signatures_56_72" id="terms/Signatures_7_23" title="Referenced at ../../core/Properties.sdf3 line 6">terms/Signatures</a>

<span class="keyword">imports</span>

        <a href="../../common/Identifiers.sdf3#common/Identifiers_7_25" id="common/Identifiers_35_53" title="Defined at ../../common/Identifiers.sdf3 line 1">common/Identifiers</a>
        <a href="../Constants.sdf3#terms/Constants_7_22" id="terms/Constants_55_70" title="Defined at ../Constants.sdf3 line 1">terms/Constants</a>
        
<span class="keyword">sorts</span> 

  <a href="#Sort_662_666" id="Sort_83_87" title="Referenced at line 40; ../../core/Properties.sdf3 line 30">Sort</a>

<span class="keyword">context-free syntax</span>
        
        <a href="#Sort_662_666" id="Sort_112_116" title="Referenced at line 40; ../../core/Properties.sdf3 line 30">Sort</a>.<span class="cons_Constructor"><span id="SortVar_117_124" title="Not referenced locally, nor via imports">SortVar</span></span>    = <a href="../../common/Identifiers.sdf3#LCID_43_47" id="LCID_130_134" title="Defined at ../../common/Identifiers.sdf3 line 5, 12, 29">LCID</a>
        <a href="#Sort_662_666" id="Sort_136_140" title="Referenced at line 40; ../../core/Properties.sdf3 line 30">Sort</a>.<span class="cons_Constructor"><span id="SortNoArgs_141_151" title="Not referenced locally, nor via imports">SortNoArgs</span></span> = <a href="../../common/Identifiers.sdf3#UCID_48_52" id="UCID_154_158" title="Defined at ../../common/Identifiers.sdf3 line 5, 13, 30">UCID</a>
        <a href="#Sort_662_666" id="Sort_160_164" title="Referenced at line 40; ../../core/Properties.sdf3 line 30">Sort</a>.<span class="cons_Constructor"><span id="Sort_165_169" title="Not referenced locally, nor via imports">Sort</span></span>       = <a href="../../common/Identifiers.sdf3#Id_36_38" id="Id_178_180" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a> <span class="cons_Lit">"("</span> {<a href="#Sort_83_87" id="Sort_186_190" title="Defined at line 10, 14, 15, 16">Sort</a> <span class="cons_Lit">","</span>}* <span class="cons_Lit">")"</span>

<span class="keyword">sorts</span> <span id="TypeDecl_208_216" title="Not referenced locally, nor via imports">TypeDecl</span> <a href="#PPTerm_335_341" id="PPTerm_217_223" title="Referenced at line 23">PPTerm</a>

<span class="keyword">context-free syntax</span>

  <span id="TypeDecl_248_256" title="Not referenced locally, nor via imports">TypeDecl</span>.<span class="cons_Constructor"><span id="TypeDecl_257_265" title="Not referenced locally, nor via imports">TypeDecl</span></span>  = <a href="../../common/Identifiers.sdf3#Id_36_38" id="Id_269_271" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a>     <a href="#TypeParams_381_391" id="TypeParams_276_286" title="Defined at line 26, 30, 31">TypeParams</a> <a href="#PPTerm_217_223" id="PPTerm_287_293" title="Defined at line 18, 24">PPTerm</a>
  <span id="TypeDecl_296_304" title="Not referenced locally, nor via imports">TypeDecl</span>.<span class="cons_Constructor"><span id="TypeDeclQ_305_314" title="Not referenced locally, nor via imports">TypeDeclQ</span></span> = <a href="../Constants.sdf3#String_43_49" id="String_317_323" title="Defined at ../Constants.sdf3 line 5, 11">String</a> <a href="#TypeParams_381_391" id="TypeParams_324_334" title="Defined at line 26, 30, 31">TypeParams</a> <a href="#PPTerm_217_223" id="PPTerm_335_341" title="Defined at line 18, 24">PPTerm</a>
  <a href="#PPTerm_335_341" id="PPTerm_344_350" title="Referenced at line 23">PPTerm</a>.<span class="cons_Constructor"><span id="Str_351_354" title="Not referenced locally, nor via imports">Str</span></span>         = <a href="../Constants.sdf3#String_43_49" id="String_365_371" title="Defined at ../Constants.sdf3 line 5, 11">String</a>
  
<span class="keyword">sorts</span> <a href="#TypeParams_324_334" id="TypeParams_381_391" title="Referenced at line 23">TypeParams</a> <a href="#TypeParam_487_496" id="TypeParam_392_401" title="Referenced at line 31">TypeParam</a> 

<span class="keyword">context-free syntax</span>
        
  <a href="#TypeParams_324_334" id="TypeParams_428_438" title="Referenced at line 23">TypeParams</a>.<span class="cons_Constructor"><span id="NoTypeParams_439_451" title="Not referenced locally, nor via imports">NoTypeParams</span></span> =
  <a href="#TypeParams_324_334" id="TypeParams_456_466" title="Referenced at line 23">TypeParams</a>.<span class="cons_Constructor"><span id="TypeParams_467_477" title="Not referenced locally, nor via imports">TypeParams</span></span>   = <span class="cons_Lit">"("</span> {<a href="#TypeParam_392_401" id="TypeParam_487_496" title="Defined at line 26, 32">TypeParam</a> <span class="cons_Lit">","</span>}+ <span class="cons_Lit">")"</span>
  <a href="#TypeParam_487_496" id="TypeParam_509_518" title="Referenced at line 31">TypeParam</a>.<span class="cons_Constructor"><span id="TypeParam_519_528" title="Not referenced locally, nor via imports">TypeParam</span></span>     = <a href="../../common/Identifiers.sdf3#Id_36_38" id="Id_535_537" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a> <span class="cons_Lit">":"</span> <a href="#Sort_83_87" id="Sort_542_546" title="Defined at line 10, 14, 15, 16">Sort</a>
  
<span class="layout">%%%</span>
<span class="layout">%% Restriction is required for the Sort* in Sdecl: List(a) is</span>
<span class="layout">%% ambiguous.</span>
<span class="layout">%%%</span>
<span class="keyword">context-free restrictions</span>

        <a href="#Sort_83_87" id="Sort_662_666" title="Defined at line 10, 14, 15, 16">Sort</a> -/- [\(]

</code></pre></td></tr></tbody></table></div>