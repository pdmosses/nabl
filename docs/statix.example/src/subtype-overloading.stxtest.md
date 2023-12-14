---
title: subtype-overloading.stxtest
hide:
  - toc
---

# `subtype-overloading.stxtest`

:simple-github: [pdmosses/nabl/statix.example/src/subtype-overloading.stxtest]

[pdmosses/nabl/statix.example/src/subtype-overloading.stxtest]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/subtype-overloading.stxtest "The source file on GitHub"

<div class="stx"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
45
46
47
48
49
50
51
52
53
54
55
</pre></div></td>
<td class="code"><pre><code><span class="layout">/** Type-based overload resolution with subtyping
                      * Goal:
                      * Result:
                      * - Function resolution does select compatible functions based on the `subType`
                      *   relation.
                      * - Currently there is now way to select the _best_ compatible function.
                      */</span>
<span class="keyword">resolve</span> <span class="operator">{</span><span class="cons_Var"><a href="#s_10_7" id="s_8_10" title="Referenced at line 10, 11, 12, 13, 14"><span class="token sort_Id">s</span></a></span> <span class="cons_Var"><a href="#result_14_39" id="result_8_12" title="Referenced at line 14"><span class="token sort_Id">result</span></a></span><span class="operator">}</span>

  <span class="keyword">new</span> <span class="cons_Var"><a href="#s_8_10" id="s_10_7" title="Defined at line 8"><span class="token sort_Id">s</span></a></span><span class="operator">,</span>
  <span class="token sort_Id">s</span> <span class="operator">-&gt;</span> <span class="token sort_Id">Fun</span><span class="operator">{"</span><span class="token sort_Id">f</span><span class="operator">"@-}</span> <span class="keyword">with</span> <span class="cons_Label"><a href="#funType_29_5" id="funType_11_24" title="Defined at line 29"><span class="token sort_Id">funType</span></a></span> <span class="cons_Op"><a href="#INT_21_5" id="INT_11_32" title="Defined at line 21"><span class="token sort_Id">INT</span></a>()</span><span class="operator">,</span>
  <span class="token sort_Id">s</span> <span class="operator">-&gt;</span> <span class="token sort_Id">Fun</span><span class="operator">{"</span><span class="token sort_Id">f</span><span class="operator">"@-}</span> <span class="keyword">with</span> <span class="cons_Label"><a href="#funType_29_5" id="funType_12_24" title="Defined at line 29"><span class="token sort_Id">funType</span></a></span> <span class="cons_Op"><a href="#NAT_22_5" id="NAT_12_32" title="Defined at line 22"><span class="token sort_Id">NAT</span></a>()</span><span class="operator">,</span>
  <span class="token sort_Id">s</span> <span class="operator">-&gt;</span> <span class="token sort_Id">Fun</span><span class="operator">{"</span><span class="token sort_Id">f</span><span class="operator">"@-}</span> <span class="keyword">with</span> <span class="cons_Label"><a href="#funType_29_5" id="funType_13_24" title="Defined at line 29"><span class="token sort_Id">funType</span></a></span> <span class="cons_Op"><a href="#POS_23_5" id="POS_13_32" title="Defined at line 23"><span class="token sort_Id">POS</span></a>()</span><span class="operator">,</span>
  <a href="#resolveFun_33_3" id="resolveFun_14_3" title="Defined at line 33"><span class="token sort_Id">resolveFun</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_8_10" id="s_14_14" title="Defined at line 8"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_StxOccurrence"><a href="#Fun_26_5" id="Fun_14_17" title="Defined at line 26"><span class="token sort_Id">Fun</span></a><span class="operator">{</span><span class="cons_Str"><span class="operator">"</span>f"</span>@-}</span><span class="operator">,</span> <span class="cons_Op"><a href="#NAT_22_5" id="NAT_14_29" title="Defined at line 22"><span class="token sort_Id">NAT</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#result_8_12" id="result_14_39" title="Defined at line 8"><span class="token sort_Id">result</span></a></span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortAlias"><a href="#ID_26_11" id="ID_18_9" title="Referenced at line 26"><span class="token sort_Id">ID</span></a> <span class="operator">=</span> <span class="cons_StringSort">string</span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#TYPE_21_11" id="TYPE_20_9" title="Referenced at line 21, 22, 23, 29, 33, 44, 54"><span class="token sort_Id">TYPE</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#INT_11_32" id="INT_21_5" title="Referenced at line 11, 48, 49"><span class="token sort_Id">INT</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_20_9" id="TYPE_21_11" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="#NAT_12_32" id="NAT_22_5" title="Referenced at line 12, 14, 47, 49"><span class="token sort_Id">NAT</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_20_9" id="TYPE_22_11" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="#POS_13_32" id="POS_23_5" title="Referenced at line 13, 47, 48"><span class="token sort_Id">POS</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_20_9" id="TYPE_23_11" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span></span>

  <span class="keyword">namespaces</span>
    <span class="cons_NsDecl"><a href="#Fun_11_8" id="Fun_26_5" title="Referenced at line 11, 12, 13, 14, 35, 37"><span class="token sort_Id">Fun</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_18_9" id="ID_26_11" title="Defined at line 18"><span class="token sort_Id">ID</span></a></span></span>

  <span class="keyword">relations</span>
    <span class="cons_Label"><a href="#funType_11_24" id="funType_29_5" title="Referenced at line 11, 12, 13, 36"><span class="token sort_Id">funType</span></a></span> <span class="operator">:</span> <span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_20_9" id="TYPE_29_28" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span>

<span class="keyword">rules</span>

  <a href="#resolveFun_14_3" id="resolveFun_33_3" title="Referenced at line 14, 35"><span class="token sort_Id">resolveFun</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_20_9" id="TYPE_33_37" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">((</span><span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_20_9" id="TYPE_33_64" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span><span class="operator">))</span>

  <a href="#resolveFun_33_3" id="resolveFun_35_3" title="Defined at line 33"><span class="token sort_Id">resolveFun</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_39_10" id="s_35_14" title="Referenced at line 39"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_StxOccurrence"><a href="#Fun_26_5" id="Fun_35_17" title="Defined at line 26"><span class="token sort_Id">Fun</span></a><span class="operator">{</span><span class="cons_Var"><a href="#x_37_40" id="x_35_21" title="Referenced at line 37"><span class="token sort_Id">x</span></a></span>@_}</span><span class="operator">,</span> <span class="cons_Var"><a href="#T_37_56" id="T_35_27" title="Referenced at line 37"><span class="token sort_Id">T</span></a></span><span class="operator">)</span> <span class="operator">=</span> <a href="#pots2ots_53_3" id="pots2ots_35_32" title="Defined at line 53"><span class="token sort_Id">pots2ots</span></a><span class="operator">(</span><span class="cons_Var"><a href="#funs_40_11" id="funs_35_41" title="Referenced at line 40"><span class="token sort_Id">funs</span></a></span><span class="operator">)</span> <span class="operator">:-</span> <span class="operator">{}</span>
    <span class="keyword">query</span> <span class="cons_Label"><a href="#funType_29_5" id="funType_36_11" title="Defined at line 29"><span class="token sort_Id">funType</span></a></span>
      <span class="keyword">filter</span> <span class="operator">~</span>0 <span class="keyword">and</span> <span class="operator">{</span> <span class="operator">(</span><span class="cons_StxOccurrence"><a href="#Fun_26_5" id="Fun_37_24" title="Defined at line 26"><span class="token sort_Id">Fun</span></a><span class="operator">{</span><span class="cons_Var"><a href="#y_37_45" id="y_37_28" title="Referenced at line 37"><span class="token sort_Id">y</span></a></span>@_}</span><span class="operator">,</span> <span class="cons_Var"><a href="#U_37_59" id="U_37_34" title="Referenced at line 37"><span class="token sort_Id">U</span></a></span><span class="operator">)</span> <span class="operator">:-</span> <span class="cons_Var"><a href="#x_35_21" id="x_37_40" title="Defined at line 35"><span class="token sort_Id">x</span></a></span> <span class="operator">==</span> <span class="cons_Var"><a href="#y_37_28" id="y_37_45" title="Defined at line 37"><span class="token sort_Id">y</span></a></span><span class="operator">,</span> <a href="#subType_44_3" id="subType_37_48" title="Defined at line 44"><span class="token sort_Id">subType</span></a><span class="operator">(</span><span class="cons_Var"><a href="#T_35_27" id="T_37_56" title="Defined at line 35"><span class="token sort_Id">T</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#U_37_34" id="U_37_59" title="Defined at line 37"><span class="token sort_Id">U</span></a></span><span class="operator">)</span> <span class="operator">}</span>
      <span class="keyword">min</span> <span class="keyword">and</span> <span class="operator">{</span> <span class="operator">(_,</span> <span class="cons_Var"><a href="#T1_38_45" id="T1_38_21" title="Referenced at line 38"><span class="token sort_Id">T1</span></a></span><span class="operator">),</span> <span class="operator">(_,</span> <span class="cons_Var"><a href="#T2_38_49" id="T2_38_30" title="Referenced at line 38"><span class="token sort_Id">T2</span></a></span><span class="operator">)</span> <span class="operator">:-</span> <a href="#subType_44_3" id="subType_38_37" title="Defined at line 44"><span class="token sort_Id">subType</span></a><span class="operator">(</span><span class="cons_Var"><a href="#T1_38_21" id="T1_38_45" title="Defined at line 38"><span class="token sort_Id">T1</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#T2_38_30" id="T2_38_49" title="Defined at line 38"><span class="token sort_Id">T2</span></a></span><span class="operator">)</span> <span class="operator">}</span>
      <span class="keyword">in</span> <span class="cons_Var"><a href="#s_35_14" id="s_39_10" title="Defined at line 35"><span class="token sort_Id">s</span></a></span>
      <span class="operator">|-&gt;</span> <span class="cons_Var"><a href="#funs_35_41" id="funs_40_11" title="Defined at line 35"><span class="token sort_Id">funs</span></a></span><span class="operator">.</span>

<span class="keyword">rules</span>

  <a href="#subType_37_48" id="subType_44_3" title="Referenced at line 37, 38, 46, 47, 48, 49"><span class="token sort_Id">subType</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_20_9" id="TYPE_44_13" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_20_9" id="TYPE_44_20" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span>

  <a href="#subType_44_3" id="subType_46_3" title="Defined at line 44"><span class="token sort_Id">subType</span></a><span class="operator">(</span><span class="cons_Var"><span id="T_46_11" title="Not referenced"><span class="token sort_Id">T</span></span></span><span class="operator">,</span> <span class="cons_Var">T</span><span class="operator">).</span>
  <a href="#subType_44_3" id="subType_47_3" title="Defined at line 44"><span class="token sort_Id">subType</span></a><span class="operator">(</span><span class="cons_Op"><a href="#POS_23_5" id="POS_47_11" title="Defined at line 23"><span class="token sort_Id">POS</span></a>()</span><span class="operator">,</span> <span class="cons_Op"><a href="#NAT_22_5" id="NAT_47_18" title="Defined at line 22"><span class="token sort_Id">NAT</span></a>()</span><span class="operator">).</span>
  <a href="#subType_44_3" id="subType_48_3" title="Defined at line 44"><span class="token sort_Id">subType</span></a><span class="operator">(</span><span class="cons_Op"><a href="#POS_23_5" id="POS_48_11" title="Defined at line 23"><span class="token sort_Id">POS</span></a>()</span><span class="operator">,</span> <span class="cons_Op"><a href="#INT_21_5" id="INT_48_18" title="Defined at line 21"><span class="token sort_Id">INT</span></a>()</span><span class="operator">).</span>
  <a href="#subType_44_3" id="subType_49_3" title="Defined at line 44"><span class="token sort_Id">subType</span></a><span class="operator">(</span><span class="cons_Op"><a href="#NAT_22_5" id="NAT_49_11" title="Defined at line 22"><span class="token sort_Id">NAT</span></a>()</span><span class="operator">,</span> <span class="cons_Op"><a href="#INT_21_5" id="INT_49_18" title="Defined at line 21"><span class="token sort_Id">INT</span></a>()</span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#pots2ots_35_32" id="pots2ots_53_3" title="Referenced at line 35"><span class="token sort_Id">pots2ots</span></a> <span class="keyword">maps</span> <a href="#pot2ot_54_3" id="pot2ot_53_17" title="Defined at line 54"><span class="token sort_Id">pot2ot</span></a><span class="operator">(</span><span class="keyword">list</span><span class="operator">(*))</span> <span class="operator">=</span> <span class="keyword">list</span><span class="operator">(*)</span>
  <a href="#pot2ot_53_17" id="pot2ot_54_3" title="Referenced at line 53, 55"><span class="token sort_Id">pot2ot</span></a> <span class="operator">:</span> <span class="operator">(</span><span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="operator">(</span><span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_20_9" id="TYPE_54_34" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span><span class="operator">))</span> <span class="operator">-&gt;</span> <span class="operator">(</span><span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_20_9" id="TYPE_54_58" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span>
  <a href="#pot2ot_54_3" id="pot2ot_55_3" title="Defined at line 54"><span class="token sort_Id">pot2ot</span></a><span class="operator">((_,</span> <span class="cons_Var"><span id="ot_55_14" title="Not referenced"><span class="token sort_Id">ot</span></span></span><span class="operator">))</span> <span class="operator">=</span> <span class="cons_Var">ot</span><span class="operator">.</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
