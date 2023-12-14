---
title: path-lib.stx
hide:
  - toc
---

# `path-lib.stx`

:simple-github: [pdmosses/nabl/statix.example/src/path-lib.stx]

[pdmosses/nabl/statix.example/src/path-lib.stx]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/path-lib.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="path-lib_1_8" title="Not referenced"><span class="keyword">path</span><span class="operator">-</span><span class="token sort_Id">lib</span></span>

<span class="keyword">rules</span>

  <a href="#src_6_3" id="src_5_3" title="Referenced at line 6, 7"><span class="token sort_Id">src</span></a> <span class="operator">:</span> <span class="cons_PathSort">path</span> <span class="operator">-&gt;</span> <span class="cons_ScopeSort">scope</span>
  <a href="#src_5_3" id="src_6_3" title="Defined at line 5"><span class="token sort_Id">src</span></a><span class="operator">(_</span><span class="token sort_Id">PathEmpty</span><span class="operator">(</span><span class="cons_Var"><span id="s_6_18" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">))</span> <span class="operator">=</span> <span class="cons_Var">s</span><span class="operator">.</span>
  <a href="#src_5_3" id="src_7_3" title="Defined at line 5"><span class="token sort_Id">src</span></a><span class="operator">(_</span><span class="token sort_Id">PathStep</span><span class="operator">(</span><span class="cons_Var"><span id="p_7_17" title="Not referenced"><span class="token sort_Id">p</span></span></span><span class="operator">,</span> <span class="operator">_,</span> <span class="operator">_))</span> <span class="operator">=</span> <a href="#src_5_3" id="src_7_29" title="Defined at line 5"><span class="token sort_Id">src</span></a><span class="operator">(</span><span class="cons_Var">p</span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#dst_12_3" id="dst_11_3" title="Referenced at line 12, 13"><span class="token sort_Id">dst</span></a> <span class="operator">:</span> <span class="cons_PathSort">path</span> <span class="operator">-&gt;</span> <span class="cons_ScopeSort">scope</span>
  <a href="#dst_11_3" id="dst_12_3" title="Defined at line 11"><span class="token sort_Id">dst</span></a><span class="operator">(_</span><span class="token sort_Id">PathEmpty</span><span class="operator">(</span><span class="cons_Var">s</span><span class="operator">))</span> <span class="operator">=</span> <span class="cons_Var"><span id="s_12_24" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">.</span>
  <a href="#dst_11_3" id="dst_13_3" title="Defined at line 11"><span class="token sort_Id">dst</span></a><span class="operator">(_</span><span class="token sort_Id">PathStep</span><span class="operator">(_,</span> <span class="operator">_,</span> <span class="cons_Var"><span id="s_13_23" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">))</span> <span class="operator">=</span> <span class="cons_Var">s</span><span class="operator">.</span>

<span class="keyword">rules</span>

  <a href="#scopes_18_3" id="scopes_17_3" title="Referenced at line 18"><span class="token sort_Id">scopes</span></a> <span class="operator">:</span> <span class="cons_PathSort">path</span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_ScopeSort">scope</span><span class="operator">)</span>
  <a href="#scopes_17_3" id="scopes_18_3" title="Defined at line 17"><span class="token sort_Id">scopes</span></a><span class="operator">(</span><span class="cons_Var"><span id="p_18_10" title="Not referenced"><span class="token sort_Id">p</span></span></span><span class="operator">)</span> <span class="operator">=</span> <a href="#scopes_acc_20_3" id="scopes_acc_18_15" title="Defined at line 20"><span class="token sort_Id">scopes_acc</span></a><span class="operator">(</span><span class="cons_Var">p</span><span class="operator">,</span> <span class="operator">[]).</span>

  <a href="#scopes_acc_18_15" id="scopes_acc_20_3" title="Referenced at line 18, 21, 22"><span class="token sort_Id">scopes_acc</span></a> <span class="operator">:</span> <span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_ScopeSort">scope</span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_ScopeSort">scope</span><span class="operator">)</span>
  <a href="#scopes_acc_20_3" id="scopes_acc_21_3" title="Defined at line 20"><span class="token sort_Id">scopes_acc</span></a><span class="operator">(_</span><span class="token sort_Id">PathEmpty</span><span class="operator">(</span><span class="cons_Var"><span id="s_21_25" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">),</span> <span class="cons_Var"><span id="acc_21_29" title="Not referenced"><span class="token sort_Id">acc</span></span></span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">[</span><span class="cons_Var">s</span><span class="operator">|</span><span class="cons_Var">acc</span><span class="operator">].</span>
  <a href="#scopes_acc_20_3" id="scopes_acc_22_3" title="Defined at line 20"><span class="token sort_Id">scopes_acc</span></a><span class="operator">(_</span><span class="token sort_Id">PathStep</span><span class="operator">(</span><span class="cons_Var">p</span><span class="operator">,</span> <span class="operator">_,</span> <span class="cons_Var">s</span><span class="operator">),</span> <span class="cons_Var">acc</span><span class="operator">)</span> <span class="operator">=</span> <a href="#scopes_acc_20_3" id="scopes_acc_22_41" title="Defined at line 20"><span class="token sort_Id">scopes_acc</span></a><span class="operator">(</span><span class="cons_Var"><span id="p_22_52" title="Not referenced"><span class="token sort_Id">p</span></span></span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var"><span id="s_22_56" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">|</span><span class="cons_Var"><span id="acc_22_58" title="Not referenced"><span class="token sort_Id">acc</span></span></span><span class="operator">]).</span>

<span class="keyword">rules</span>

  <a href="#pathLabels_27_3" id="pathLabels_26_3" title="Referenced at line 27"><span class="token sort_Id">pathLabels</span></a> <span class="operator">:</span> <span class="cons_PathSort">path</span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_LabelSort">label</span><span class="operator">)</span>
  <a href="#pathLabels_26_3" id="pathLabels_27_3" title="Defined at line 26"><span class="token sort_Id">pathLabels</span></a><span class="operator">(</span><span class="cons_Var"><span id="p_27_14" title="Not referenced"><span class="token sort_Id">p</span></span></span><span class="operator">)</span> <span class="operator">=</span> <a href="#pathLabels_acc_29_3" id="pathLabels_acc_27_19" title="Defined at line 29"><span class="token sort_Id">pathLabels_acc</span></a><span class="operator">(</span><span class="cons_Var">p</span><span class="operator">,</span> <span class="operator">[]).</span>

  <a href="#pathLabels_acc_27_19" id="pathLabels_acc_29_3" title="Referenced at line 27, 30, 31"><span class="token sort_Id">pathLabels_acc</span></a> <span class="operator">:</span> <span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_LabelSort">label</span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_LabelSort">label</span><span class="operator">)</span>
  <a href="#pathLabels_acc_29_3" id="pathLabels_acc_30_3" title="Defined at line 29"><span class="token sort_Id">pathLabels_acc</span></a><span class="operator">(_</span><span class="token sort_Id">PathEmpty</span><span class="operator">(_),</span> <span class="cons_Var"><span id="acc_30_33" title="Not referenced"><span class="token sort_Id">acc</span></span></span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">[].</span>
  <a href="#pathLabels_acc_29_3" id="pathLabels_acc_31_3" title="Defined at line 29"><span class="token sort_Id">pathLabels_acc</span></a><span class="operator">(_</span><span class="token sort_Id">PathStep</span><span class="operator">(</span><span class="cons_Var"><span id="p_31_28" title="Not referenced"><span class="token sort_Id">p</span></span></span><span class="operator">,</span> <span class="cons_Var">l</span><span class="operator">,</span> <span class="operator">_),</span> <span class="cons_Var">acc</span><span class="operator">)</span> <span class="operator">=</span> <a href="#pathLabels_acc_29_3" id="pathLabels_acc_31_45" title="Defined at line 29"><span class="token sort_Id">pathLabels_acc</span></a><span class="operator">(</span><span class="cons_Var">p</span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var"><span id="l_31_64" title="Not referenced"><span class="token sort_Id">l</span></span></span><span class="operator">|</span><span class="cons_Var"><span id="acc_31_66" title="Not referenced"><span class="token sort_Id">acc</span></span></span><span class="operator">]).</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
