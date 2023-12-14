---
title: NameResolution.sdf3
hide:
  - toc
---

# `NameResolution.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/NameResolution.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/NameResolution.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/NameResolution.sdf3 "The source file on GitHub"

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
42
43
44
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Signature.sdf3/#nabl2/lang/signatures/NameResolution_8_3" id="nabl2/lang/signatures/NameResolution_1_8" title="Referenced at ../Signature.sdf3 line 8">nabl2/lang/signatures/NameResolution</a>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/shared/common/Identifiers</span>
  <span title="External reference">nabl2/shared/common/ScopeGraph</span>
  <span title="External reference">nabl2/shared/common/Sorts</span>
  <span title="External reference">nabl2/shared/common/Resolution</span>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\']

<span class="keyword">context-free syntax</span>

  <a href="../Signature.sdf3/#NaBL2-Signature_19_9" id="NaBL2-Signature_16_3" title="Referenced at ../Signature.sdf3 line 19">NaBL2-Signature</a>.<span class="cons_Constructor"><span id="NameResolution_16_19" title="Not referenced">NameResolution</span></span> = &lt;
    <span class="cons_String">name</span> <span class="cons_String">resolution</span>
      &lt;{<a href="#NaBL2-NameResolutionParam_21_3" id="NaBL2-NameResolutionParam_18_9" title="Defined at line 21, 22, 23, 24, 25, 26, 27">NaBL2-NameResolutionParam</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#NaBL2-NameResolutionParam_18_9" id="NaBL2-NameResolutionParam_21_3" title="Referenced at line 18">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="Labels_21_29" title="Not referenced">Labels</span></span>        = &lt;<span class="cons_String">labels</span> &lt;{<span title="External reference">NaBL2-PathLabel</span> <span class="cons_Lit">" "</span>}*&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_18_9" id="NaBL2-NameResolutionParam_22_3" title="Referenced at line 18">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="Order_22_29" title="Not referenced">Order</span></span>         = &lt;<span class="cons_String">order</span> &lt;{<span title="External reference">NaBL2-LabelOrder</span> <span class="cons_Lit">",\n"</span>}*&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_18_9" id="NaBL2-NameResolutionParam_23_3" title="Referenced at line 18">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="WF_23_29" title="Not referenced">WF</span></span>            = &lt;<span class="cons_String">well-formedness</span> &lt;<span title="External reference">NaBL2-LabelRE</span>&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_18_9" id="NaBL2-NameResolutionParam_24_3" title="Referenced at line 18">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="DefaultELabel_24_29" title="Not referenced">DefaultELabel</span></span> = &lt;<span class="cons_String">default</span> <span class="cons_String">edge</span> <span class="cons_String">label</span> &lt;<span title="External reference">NaBL2-PathLabel</span>&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_18_9" id="NaBL2-NameResolutionParam_25_3" title="Referenced at line 18">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="DefaultNLabel_25_29" title="Not referenced">DefaultNLabel</span></span> = &lt;<span class="cons_String">default</span> <span class="cons_String">named</span> <span class="cons_String">label</span> &lt;<span title="External reference">NaBL2-PathLabel</span>&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_18_9" id="NaBL2-NameResolutionParam_26_3" title="Referenced at line 18">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="Strategy_26_29" title="Not referenced">Strategy</span></span>      = &lt;<span class="cons_String">strategy</span> &lt;<span title="External reference">NaBL2-Strategy</span>&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_18_9" id="NaBL2-NameResolutionParam_27_3" title="Referenced at line 18">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="PathRelevance_27_29" title="Not referenced">PathRelevance</span></span> = &lt;<span class="cons_String">paths</span> &lt;<span title="External reference">NaBL2-Relevance</span>&gt;&gt;

<span class="keyword">context-free syntax</span>

  <a href="../Signature.sdf3/#NaBL2-Signature_19_9" id="NaBL2-Signature_31_3" title="Referenced at ../Signature.sdf3 line 19">NaBL2-Signature</a>.<span class="cons_Constructor"><span id="Namespaces_31_19" title="Not referenced">Namespaces</span></span> = &lt;
    <span class="cons_String">namespaces</span>
      &lt;{<a href="#NaBL2-NamespaceDef_36_3" id="NaBL2-NamespaceDef_33_9" title="Defined at line 36">NaBL2-NamespaceDef</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#NaBL2-NamespaceDef_33_9" id="NaBL2-NamespaceDef_36_3" title="Referenced at line 33">NaBL2-NamespaceDef</a>.<span class="cons_Constructor"><span id="NamespaceDef_36_22" title="Not referenced">NamespaceDef</span></span> = &lt;&lt;<span title="External reference">NaBL2-Namespace</span>&gt; &lt;<a href="#NaBL2-NamespaceType_38_3" id="NaBL2-NamespaceType_36_57" title="Defined at line 38, 39">NaBL2-NamespaceType</a>&gt; &lt;<a href="#NaBL2-NamespaceProperties_41_3" id="NaBL2-NamespaceProperties_36_79" title="Defined at line 41, 42">NaBL2-NamespaceProperties</a>&gt;&gt;

  <a href="#NaBL2-NamespaceType_36_57" id="NaBL2-NamespaceType_38_3" title="Referenced at line 36">NaBL2-NamespaceType</a>.<span class="cons_Constructor"><span id="NoType_38_23" title="Not referenced">NoType</span></span>  =
  <a href="#NaBL2-NamespaceType_36_57" id="NaBL2-NamespaceType_39_3" title="Referenced at line 36">NaBL2-NamespaceType</a>.<span class="cons_Constructor"><span id="Type_39_23" title="Not referenced">Type</span></span>    = &lt;<span class="cons_String">:</span> &lt;<span title="External reference">NaBL2-SortRef</span>&gt;&gt;

  <a href="#NaBL2-NamespaceProperties_36_79" id="NaBL2-NamespaceProperties_41_3" title="Referenced at line 36">NaBL2-NamespaceProperties</a> = &lt;<span class="cons_String">{</span> &lt;{<a href="#NaBL2-NamespaceProperty_44_3" id="NaBL2-NamespaceProperty_41_36" title="Defined at line 44">NaBL2-NamespaceProperty</a> <span class="cons_Lit">",\n"</span>}*&gt; <span class="cons_String">}</span>&gt;
  <a href="#NaBL2-NamespaceProperties_36_79" id="NaBL2-NamespaceProperties_42_3" title="Referenced at line 36">NaBL2-NamespaceProperties</a> = {<span class="cons_Unquoted">ast</span>(<span class="cons_Quoted">"[]"</span>)}
  
  <a href="#NaBL2-NamespaceProperty_41_36" id="NaBL2-NamespaceProperty_44_3" title="Referenced at line 41">NaBL2-NamespaceProperty</a>.<span class="cons_Constructor"><span id="PropertyDef_44_27" title="Not referenced">PropertyDef</span></span> = &lt;&lt;<span title="External reference">NaBL2-PropertyId</span>&gt; <span class="cons_String">:</span> &lt;<span title="External reference">NaBL2-SortRef</span>&gt;&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
