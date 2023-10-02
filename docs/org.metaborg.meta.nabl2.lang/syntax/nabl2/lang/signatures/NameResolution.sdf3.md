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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Signature.sdf3#nabl2/lang/signatures/NameResolution_151_187" id="nabl2/lang/signatures/NameResolution_7_43" title="Referenced at ../Signature.sdf3 line 8">nabl2/lang/signatures/NameResolution</a>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/shared/common/Identifiers</span>
  <span title="External reference">nabl2/shared/common/ScopeGraph</span>
  <span title="External reference">nabl2/shared/common/Sorts</span>
  <span title="External reference">nabl2/shared/common/Resolution</span>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\']

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-Signature_253_268" title="Not referenced locally, nor via imports">NaBL2-Signature</span>.<span class="cons_Constructor"><span id="NameResolution_269_283" title="Not referenced locally, nor via imports">NameResolution</span></span> = &lt;
    <span class="cons_String">name</span> <span class="cons_String">resolution</span>
      &lt;{<a href="#NaBL2-NameResolutionParam_375_400" id="NaBL2-NameResolutionParam_316_341" title="Defined at line 21, 22, 23, 24, 25, 26, 27">NaBL2-NameResolutionParam</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#NaBL2-NameResolutionParam_316_341" id="NaBL2-NameResolutionParam_375_400" title="Referenced at line 18">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="Labels_401_407" title="Not referenced locally, nor via imports">Labels</span></span>        = &lt;<span class="cons_String">labels</span> &lt;{<span title="External reference">NaBL2-PathLabel</span> <span class="cons_Lit">" "</span>}*&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_316_341" id="NaBL2-NameResolutionParam_453_478" title="Referenced at line 18">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="Order_479_484" title="Not referenced locally, nor via imports">Order</span></span>         = &lt;<span class="cons_String">order</span> &lt;{<span title="External reference">NaBL2-LabelOrder</span> <span class="cons_Lit">",\n"</span>}*&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_316_341" id="NaBL2-NameResolutionParam_533_558" title="Referenced at line 18">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="WF_559_561" title="Not referenced locally, nor via imports">WF</span></span>            = &lt;<span class="cons_String">well-formedness</span> &lt;<span title="External reference">NaBL2-LabelRE</span>&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_316_341" id="NaBL2-NameResolutionParam_611_636" title="Referenced at line 18">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="DefaultELabel_637_650" title="Not referenced locally, nor via imports">DefaultELabel</span></span> = &lt;<span class="cons_String">default</span> <span class="cons_String">edge</span> <span class="cons_String">label</span> &lt;<span title="External reference">NaBL2-PathLabel</span>&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_316_341" id="NaBL2-NameResolutionParam_694_719" title="Referenced at line 18">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="DefaultNLabel_720_733" title="Not referenced locally, nor via imports">DefaultNLabel</span></span> = &lt;<span class="cons_String">default</span> <span class="cons_String">named</span> <span class="cons_String">label</span> &lt;<span title="External reference">NaBL2-PathLabel</span>&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_316_341" id="NaBL2-NameResolutionParam_778_803" title="Referenced at line 18">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="Strategy_804_812" title="Not referenced locally, nor via imports">Strategy</span></span>      = &lt;<span class="cons_String">strategy</span> &lt;<span title="External reference">NaBL2-Strategy</span>&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_316_341" id="NaBL2-NameResolutionParam_850_875" title="Referenced at line 18">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="PathRelevance_876_889" title="Not referenced locally, nor via imports">PathRelevance</span></span> = &lt;<span class="cons_String">paths</span> &lt;<span title="External reference">NaBL2-Relevance</span>&gt;&gt;

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-Signature_942_957" title="Not referenced locally, nor via imports">NaBL2-Signature</span>.<span class="cons_Constructor"><span id="Namespaces_958_968" title="Not referenced locally, nor via imports">Namespaces</span></span> = &lt;
    <span class="cons_String">namespaces</span>
      &lt;{<a href="#NaBL2-NamespaceDef_1048_1066" id="NaBL2-NamespaceDef_996_1014" title="Defined at line 36">NaBL2-NamespaceDef</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#NaBL2-NamespaceDef_996_1014" id="NaBL2-NamespaceDef_1048_1066" title="Referenced at line 33">NaBL2-NamespaceDef</a>.<span class="cons_Constructor"><span id="NamespaceDef_1067_1079" title="Not referenced locally, nor via imports">NamespaceDef</span></span> = &lt;&lt;<span title="External reference">NaBL2-Namespace</span>&gt; &lt;<a href="#NaBL2-NamespaceType_1155_1174" id="NaBL2-NamespaceType_1102_1121" title="Defined at line 38, 39">NaBL2-NamespaceType</a>&gt; &lt;<a href="#NaBL2-NamespaceProperties_1240_1265" id="NaBL2-NamespaceProperties_1124_1149" title="Defined at line 41, 42">NaBL2-NamespaceProperties</a>&gt;&gt;

  <a href="#NaBL2-NamespaceType_1102_1121" id="NaBL2-NamespaceType_1155_1174" title="Referenced at line 36">NaBL2-NamespaceType</a>.<span class="cons_Constructor"><span id="NoType_1175_1181" title="Not referenced locally, nor via imports">NoType</span></span>  =
  <a href="#NaBL2-NamespaceType_1102_1121" id="NaBL2-NamespaceType_1187_1206" title="Referenced at line 36">NaBL2-NamespaceType</a>.<span class="cons_Constructor"><span id="Type_1207_1211" title="Not referenced locally, nor via imports">Type</span></span>    = &lt;<span class="cons_String">:</span> &lt;<span title="External reference">NaBL2-SortRef</span>&gt;&gt;

  <a href="#NaBL2-NamespaceProperties_1124_1149" id="NaBL2-NamespaceProperties_1240_1265" title="Referenced at line 36">NaBL2-NamespaceProperties</a> = &lt;<span class="cons_String">{</span> &lt;{<a href="#NaBL2-NamespaceProperty_1356_1379" id="NaBL2-NamespaceProperty_1273_1296" title="Defined at line 44">NaBL2-NamespaceProperty</a> <span class="cons_Lit">",\n"</span>}*&gt; <span class="cons_String">}</span>&gt;
  <a href="#NaBL2-NamespaceProperties_1124_1149" id="NaBL2-NamespaceProperties_1311_1336" title="Referenced at line 36">NaBL2-NamespaceProperties</a> = {<span class="cons_Unquoted">ast</span>(<span class="cons_Quoted">"[]"</span>)}
  
  <a href="#NaBL2-NamespaceProperty_1273_1296" id="NaBL2-NamespaceProperty_1356_1379" title="Referenced at line 41">NaBL2-NamespaceProperty</a>.<span class="cons_Constructor"><span id="PropertyDef_1380_1391" title="Not referenced locally, nor via imports">PropertyDef</span></span> = &lt;&lt;<span title="External reference">NaBL2-PropertyId</span>&gt; <span class="cons_String">:</span> &lt;<span title="External reference">NaBL2-SortRef</span>&gt;&gt;

</code></pre></td></tr></tbody></table></div>