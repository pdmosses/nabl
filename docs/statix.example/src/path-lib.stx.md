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
<td class="code"><pre><code><span class="keyword">module</span> <span id="path-lib_7_15" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">path</span><span class="operator">-</span><span class="token sort_ConstraintId">lib</span></span>

<span class="keyword">rules</span>

  <a href="#src_48_51" id="src_26_29" title="Referenced at line 6, 7, 7"><span class="token sort_ConstraintId">src</span></a> <span class="operator">:</span> <span class="cons_PathSort">path</span> <span class="operator">-&gt;</span> <span class="cons_ScopeSort">scope</span>
  <a href="#src_26_29" id="src_48_51" title="Defined at line 5"><span class="token sort_ConstraintId">src</span></a><span class="operator">(_</span><span class="token sort_OpId">PathEmpty</span><span class="operator">(</span><span class="cons_Var">s</span><span class="operator">))</span> <span class="operator">=</span> <span class="cons_Var"><span id="s_69_70" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span><span class="operator">.</span>
  <a href="#src_26_29" id="src_74_77" title="Defined at line 5"><span class="token sort_ConstraintId">src</span></a><span class="operator">(_</span><span class="token sort_OpId">PathStep</span><span class="operator">(</span><span class="cons_Var"><span id="p_88_89" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">p</span></span></span><span class="operator">,</span> <span class="operator">_,</span> <span class="operator">_))</span> <span class="operator">=</span> <a href="#src_26_29" id="src_100_103" title="Defined at line 5"><span class="token sort_ConstraintId">src</span></a><span class="operator">(</span><span class="cons_Var">p</span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#dst_140_143" id="dst_118_121" title="Referenced at line 12, 13"><span class="token sort_ConstraintId">dst</span></a> <span class="operator">:</span> <span class="cons_PathSort">path</span> <span class="operator">-&gt;</span> <span class="cons_ScopeSort">scope</span>
  <a href="#dst_118_121" id="dst_140_143" title="Defined at line 11"><span class="token sort_ConstraintId">dst</span></a><span class="operator">(_</span><span class="token sort_OpId">PathEmpty</span><span class="operator">(</span><span class="cons_Var">s</span><span class="operator">))</span> <span class="operator">=</span> <span class="cons_Var"><span id="s_161_162" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span><span class="operator">.</span>
  <a href="#dst_118_121" id="dst_166_169" title="Defined at line 11"><span class="token sort_ConstraintId">dst</span></a><span class="operator">(_</span><span class="token sort_OpId">PathStep</span><span class="operator">(_,</span> <span class="operator">_,</span> <span class="cons_Var"><span id="s_186_187" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span><span class="operator">))</span> <span class="operator">=</span> <span class="cons_Var">s</span><span class="operator">.</span>

<span class="keyword">rules</span>

  <a href="#scopes_236_242" id="scopes_205_211" title="Referenced at line 18"><span class="token sort_ConstraintId">scopes</span></a> <span class="operator">:</span> <span class="cons_PathSort">path</span> <span class="operator">-&gt;</span> <span class="token sort_ConstraintId">list</span><span class="operator">(</span><span class="cons_ScopeSort">scope</span><span class="operator">)</span>
  <a href="#scopes_205_211" id="scopes_236_242" title="Defined at line 17"><span class="token sort_ConstraintId">scopes</span></a><span class="operator">(</span><span class="cons_Var">p</span><span class="operator">)</span> <span class="operator">=</span> <a href="#scopes_acc_270_280" id="scopes_acc_248_258" title="Defined at line 20"><span class="token sort_ConstraintId">scopes_acc</span></a><span class="operator">(</span><span class="cons_Var"><span id="p_259_260" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">p</span></span></span><span class="operator">,</span> <span class="operator">[]).</span>

  <a href="#scopes_acc_248_258" id="scopes_acc_270_280" title="Referenced at line 18, 21, 22, 22"><span class="token sort_ConstraintId">scopes_acc</span></a> <span class="operator">:</span> <span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="token sort_ConstraintId">list</span><span class="operator">(</span><span class="cons_ScopeSort">scope</span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="token sort_ConstraintId">list</span><span class="operator">(</span><span class="cons_ScopeSort">scope</span><span class="operator">)</span>
  <a href="#scopes_acc_270_280" id="scopes_acc_319_329" title="Defined at line 20"><span class="token sort_ConstraintId">scopes_acc</span></a><span class="operator">(_</span><span class="token sort_OpId">PathEmpty</span><span class="operator">(</span><span class="cons_Var"><span id="s_341_342" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span><span class="operator">),</span> <span class="cons_Var"><span id="acc_345_348" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">acc</span></span></span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">[</span><span class="cons_Var">s</span><span class="operator">|</span><span class="cons_Var">acc</span><span class="operator">].</span>
  <a href="#scopes_acc_270_280" id="scopes_acc_363_373" title="Defined at line 20"><span class="token sort_ConstraintId">scopes_acc</span></a><span class="operator">(_</span><span class="token sort_OpId">PathStep</span><span class="operator">(</span><span class="cons_Var">p</span><span class="operator">,</span> <span class="operator">_,</span> <span class="cons_Var">s</span><span class="operator">),</span> <span class="cons_Var">acc</span><span class="operator">)</span> <span class="operator">=</span> <a href="#scopes_acc_270_280" id="scopes_acc_401_411" title="Defined at line 20"><span class="token sort_ConstraintId">scopes_acc</span></a><span class="operator">(</span><span class="cons_Var"><span id="p_412_413" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">p</span></span></span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var"><span id="s_416_417" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span><span class="operator">|</span><span class="cons_Var"><span id="acc_418_421" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">acc</span></span></span><span class="operator">]).</span>

<span class="keyword">rules</span>

  <a href="#pathLabels_470_480" id="pathLabels_435_445" title="Referenced at line 27"><span class="token sort_ConstraintId">pathLabels</span></a> <span class="operator">:</span> <span class="cons_PathSort">path</span> <span class="operator">-&gt;</span> <span class="token sort_ConstraintId">list</span><span class="operator">(</span><span class="cons_LabelSort">label</span><span class="operator">)</span>
  <a href="#pathLabels_435_445" id="pathLabels_470_480" title="Defined at line 26"><span class="token sort_ConstraintId">pathLabels</span></a><span class="operator">(</span><span class="cons_Var">p</span><span class="operator">)</span> <span class="operator">=</span> <a href="#pathLabels_acc_512_526" id="pathLabels_acc_486_500" title="Defined at line 29"><span class="token sort_ConstraintId">pathLabels_acc</span></a><span class="operator">(</span><span class="cons_Var"><span id="p_501_502" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">p</span></span></span><span class="operator">,</span> <span class="operator">[]).</span>

  <a href="#pathLabels_acc_486_500" id="pathLabels_acc_512_526" title="Referenced at line 27, 30, 31, 31"><span class="token sort_ConstraintId">pathLabels_acc</span></a> <span class="operator">:</span> <span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="token sort_ConstraintId">list</span><span class="operator">(</span><span class="cons_LabelSort">label</span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="token sort_ConstraintId">list</span><span class="operator">(</span><span class="cons_LabelSort">label</span><span class="operator">)</span>
  <a href="#pathLabels_acc_512_526" id="pathLabels_acc_565_579" title="Defined at line 29"><span class="token sort_ConstraintId">pathLabels_acc</span></a><span class="operator">(_</span><span class="token sort_OpId">PathEmpty</span><span class="operator">(_),</span> <span class="cons_Var"><span id="acc_595_598" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">acc</span></span></span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">[].</span>
  <a href="#pathLabels_acc_512_526" id="pathLabels_acc_608_622" title="Defined at line 29"><span class="token sort_ConstraintId">pathLabels_acc</span></a><span class="operator">(_</span><span class="token sort_OpId">PathStep</span><span class="operator">(</span><span class="cons_Var">p</span><span class="operator">,</span> <span class="cons_Var">l</span><span class="operator">,</span> <span class="operator">_),</span> <span class="cons_Var">acc</span><span class="operator">)</span> <span class="operator">=</span> <a href="#pathLabels_acc_512_526" id="pathLabels_acc_650_664" title="Defined at line 29"><span class="token sort_ConstraintId">pathLabels_acc</span></a><span class="operator">(</span><span class="cons_Var"><span id="p_665_666" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">p</span></span></span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var"><span id="l_669_670" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">l</span></span></span><span class="operator">|</span><span class="cons_Var"><span id="acc_671_674" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">acc</span></span></span><span class="operator">]).</span>

</code></pre></td></tr></tbody></table></div>