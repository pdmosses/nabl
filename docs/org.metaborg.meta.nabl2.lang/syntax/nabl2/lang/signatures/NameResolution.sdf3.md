---
title: NameResolution.sdf3
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

  <a href="#NaBL2-NameResolutionParam_316_341" id="NaBL2-NameResolutionParam_375_400" title="Referenced at line 18">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="Labels_401_407" title="Not referenced locally, nor via imports">Labels</span></span>        = &lt;<span class="cons_String">labels</span> &lt;{<span class="keyword">Na</span>BL2-PathLabel " <span class="cons_Lit">"}*</span>&gt;&gt;
  <span class="keyword">Na</span><a href="#NaBL2-NameResolutionParam_316_341" id="NaBL2-NameResolutionParam_453_478" title="Referenced at line 18">BL2-NameResolutionParam.O</a><span class="keyword">r</span><span class="cons_Constructor"><span id="Order_479_484" title="Not referenced locally, nor via imports">der  </span></span>       = &lt;<span class="keyword">or</span><span class="cons_String">der &lt;</span>{<span class="keyword">Na</span><span class="keyword">BL</span>2-LabelOrder ",\<span class="keyword">n</span><span class="cons_Lit">"}*&gt;&gt;</span>
  <span class="keyword">NaBL</span><a href="#NaBL2-NameResolutionParam_316_341" id="NaBL2-NameResolutionParam_533_558" title="Referenced at line 18">2-NameResolutionParam.WF </a> <span class="cons_Constructor"><span id="WF_559_561" title="Not referenced locally, nor via imports">  </span></span>        = &lt;<span class="keyword">well</span><span class="cons_String">-formedness &lt;Na</span>B<span class="keyword">L</span>2-LabelRE&gt;&gt;
  <span class="keyword">NaBL</span>2<a href="#NaBL2-NameResolutionParam_316_341" id="NaBL2-NameResolutionParam_611_636" title="Referenced at line 18">-NameResolutionParam.Defa</a><span class="keyword">u</span><span class="cons_Constructor"><span id="DefaultELabel_637_650" title="Not referenced locally, nor via imports">ltELabel = &lt;d</span></span><span class="keyword">efau</span><span class="cons_String">lt edge</span> <span class="cons_String">labe</span>l<span class="cons_String"> &lt;NaB</span>L2-PathLabel&gt;&gt;
  N<span class="keyword">aBL</span>2-<a href="#NaBL2-NameResolutionParam_316_341" id="NaBL2-NameResolutionParam_694_719" title="Referenced at line 18">NameResolutionParam.Defau</a><span class="keyword">l</span><span class="cons_Constructor"><span id="DefaultNLabel_720_733" title="Not referenced locally, nor via imports">tNLabel = &lt;de</span></span><span class="keyword">faul</span><span class="cons_String">t named</span> <span class="cons_String">label</span> <span class="cons_String">&lt;NaBL</span>2-<span class="keyword">P</span>athLabel&gt;&gt;
  Na<span class="keyword">BL</span>2-<span class="keyword">N</span><a href="#NaBL2-NameResolutionParam_316_341" id="NaBL2-NameResolutionParam_778_803" title="Referenced at line 18">ameResolutionParam.Strate</a><span class="keyword">g</span><span class="cons_Constructor"><span id="Strategy_804_812" title="Not referenced locally, nor via imports">y      =</span></span> &lt;<span class="keyword">strateg</span><span class="cons_String">y &lt;NaBL2</span>-<span class="keyword">S</span><span class="keyword">t</span>rategy&gt;&gt;
  NaB<span class="keyword">L</span>2-<span class="keyword">Na</span><a href="#NaBL2-NameResolutionParam_316_341" id="NaBL2-NameResolutionParam_850_875" title="Referenced at line 18">meResolutionParam.PathRel</a><span class="keyword">e</span><span class="cons_Constructor"><span id="PathRelevance_876_889" title="Not referenced locally, nor via imports">vance = &lt;path</span></span><span class="keyword">s</span> &lt;<span class="keyword">N</span><span class="cons_String">aBL2-</span>R<span class="keyword">e</span><span class="keyword">l</span>evance&gt;&gt;

conte<span class="keyword">xt-free syntax</span>

  <span class="keyword">NaBL</span>2-<span class="keyword">Sig</span><span id="NaBL2-Signature_942_957" title="Not referenced locally, nor via imports">nature.Namespac</span><span class="keyword">e</span><span class="cons_Constructor"><span id="Namespaces_958_968" title="Not referenced locally, nor via imports">s = &lt;
    </span></span><span class="keyword">names</span>pace<span class="cons_String">s
      &lt;{</span><span class="keyword">N</span>aBL2-N<span class="keyword">am</span><a href="#NaBL2-NamespaceDef_1048_1066" id="NaBL2-NamespaceDef_996_1014" title="Defined at line 36">espaceDef "\n\n"}*</a>&gt;<span class="cons_Lit">
  &gt; {</span><span class="keyword">long</span>es<span class="keyword">t-match</span>}

  <span class="keyword">NaBL</span>2-<span class="keyword">Nam</span><a href="#NaBL2-NamespaceDef_996_1014" id="NaBL2-NamespaceDef_1048_1066" title="Referenced at line 33">espaceDef.Namespac</a><span class="keyword">e</span><span class="cons_Constructor"><span id="NamespaceDef_1067_1079" title="Not referenced locally, nor via imports">Def = &lt;&lt;NaBL</span></span>2-<span class="keyword">Nam</span><span class="keyword">espac</span>e&gt; &lt;NaBL2-Names<span class="keyword">p</span>a<span class="keyword">c</span><a href="#NaBL2-NamespaceType_1155_1174" id="NaBL2-NamespaceType_1102_1121" title="Defined at line 38, 39">eType&gt; &lt;NaBL2-Names</a><span class="keyword">p</span>a<span class="keyword">c</span><a href="#NaBL2-NamespaceProperties_1240_1265" id="NaBL2-NamespaceProperties_1124_1149" title="Defined at line 41, 42">eProperties&gt;&gt;

  NaBL2-Na</a><span class="keyword">mespac</span><a href="#NaBL2-NamespaceType_1102_1121" id="NaBL2-NamespaceType_1155_1174" title="Referenced at line 36">eType.NoType  =
  N</a><span class="keyword">a</span><span class="cons_Constructor"><span id="NoType_1175_1181" title="Not referenced locally, nor via imports">BL2-Na</span></span><span class="keyword">mespac</span><a href="#NaBL2-NamespaceType_1102_1121" id="NaBL2-NamespaceType_1187_1206" title="Referenced at line 36">eType.Type    = &lt;: </a>&lt;<span class="cons_Constructor"><span id="Type_1207_1211" title="Not referenced locally, nor via imports">NaBL</span></span>2-<span class="keyword">SortR</span><span class="cons_String">e</span>f&gt;&gt;

  NaBL2-Nam<span class="keyword">espace</span><a href="#NaBL2-NamespaceProperties_1124_1149" id="NaBL2-NamespaceProperties_1240_1265" title="Referenced at line 36">Properties = &lt;{ &lt;{NaBL2-N</a><span class="keyword">ames</span><span class="cons_String">p</span>a<span class="keyword">ce</span><a href="#NaBL2-NamespaceProperty_1356_1379" id="NaBL2-NamespaceProperty_1273_1296" title="Defined at line 44">Property ",\n"}*&gt; }&gt;
  </a><span class="keyword">N</span><span class="cons_Lit">aBL2-</span><span class="keyword">Nam</span>e<span class="cons_String">s</span><span class="keyword">pace</span><a href="#NaBL2-NamespaceProperties_1124_1149" id="NaBL2-NamespaceProperties_1311_1336" title="Referenced at line 36">Properties = {ast("[]")}
</a>  
 <span class="cons_Unquoted"> Na</span><span class="keyword">B</span><span class="cons_Quoted">L2-N</span><span class="keyword">amespace</span><a href="#NaBL2-NamespaceProperty_1273_1296" id="NaBL2-NamespaceProperty_1356_1379" title="Referenced at line 41">Property.PropertyDef = </a>&lt;<span class="cons_Constructor"><span id="PropertyDef_1380_1391" title="Not referenced locally, nor via imports">&lt;NaBL2-Prop</span></span><span class="keyword">ertyI</span><span class="keyword">d</span>&gt; : &lt;NaBL2-SortRef&gt;&gt;

</code></pre></td></tr></tbody></table></div>