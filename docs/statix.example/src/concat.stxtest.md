---
title: concat.stxtest
hide:
  - toc
---

# `concat.stxtest`

:simple-github: [pdmosses/nabl/statix.example/src/concat.stxtest]

[pdmosses/nabl/statix.example/src/concat.stxtest]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/concat.stxtest "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">resolve</span> <span class="operator">{</span><span class="cons_Var"><a href="#l_83_84" id="l_9_10" title="Referenced at line 3"><span class="token sort_Id">l</span></a></span><span class="operator">}</span>

  <a href="#concat_114_120" id="concat_15_21" title="Defined at line 7"><span class="token sort_Id">concat</span></a><span class="operator">([</span><span class="cons_Str"><span class="operator">"</span>I'm"</span><span class="operator">,</span> <span class="cons_Str"><span class="operator">"</span>afraid"</span><span class="operator">,</span> <span class="cons_Str"><span class="operator">"</span>I"</span><span class="operator">],</span> <span class="operator">[</span><span class="cons_Str"><span class="operator">"</span>cannot"</span><span class="operator">,</span> <span class="cons_Str"><span class="operator">"</span>do"</span><span class="operator">,</span> <span class="cons_Str"><span class="operator">"</span>that"</span><span class="operator">,</span> <span class="cons_Str"><span class="operator">"</span>Dave"</span><span class="operator">])</span> <span class="operator">==</span> <span class="cons_Var"><a href="#l_9_10" id="l_83_84" title="Defined at line 1"><span class="token sort_Id">l</span></a></span>

<span class="keyword">signature</span>
  <span class="keyword">constraints</span>
    <a href="#concat_15_21" id="concat_114_120" title="Referenced at line 3, 11, 12, 12"><span class="token sort_Id">concat</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_StringSort">string</span><span class="operator">)</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_StringSort">string</span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_StringSort">string</span><span class="operator">)</span>

<span class="keyword">rules</span>

  <a href="#concat_114_120" id="concat_177_183" title="Defined at line 7"><span class="token sort_Id">concat</span></a><span class="operator">([],</span> <span class="cons_Var"><a href="#ys_200_202" id="ys_188_190" title="Referenced at line 11"><span class="token sort_Id">ys</span></a></span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var"><a href="#zs_206_208" id="zs_194_196" title="Referenced at line 11"><span class="token sort_Id">zs</span></a></span> <span class="operator">:-</span> <span class="cons_Var"><a href="#ys_188_190" id="ys_200_202" title="Defined at line 11"><span class="token sort_Id">ys</span></a></span> <span class="operator">==</span> <span class="cons_Var"><a href="#zs_194_196" id="zs_206_208" title="Defined at line 11"><span class="token sort_Id">zs</span></a></span><span class="operator">.</span>
  <a href="#concat_114_120" id="concat_212_218" title="Defined at line 7"><span class="token sort_Id">concat</span></a><span class="operator">([</span><span class="cons_Var">x</span><span class="operator">|</span><span class="cons_Var">xs</span><span class="operator">],</span> <span class="cons_Var"><span id="ys_227_229" title="Not referenced locally, nor via imports"><span class="token sort_Id">ys</span></span></span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">[</span><span class="cons_Var"><span id="x_234_235" title="Not referenced locally, nor via imports"><span class="token sort_Id">x</span></span></span><span class="operator">|</span><a href="#concat_114_120" id="concat_236_242" title="Defined at line 7"><span class="token sort_Id">concat</span></a><span class="operator">(</span><span class="cons_Var"><span id="xs_243_245" title="Not referenced locally, nor via imports"><span class="token sort_Id">xs</span></span></span><span class="operator">,</span> <span class="cons_Var">ys</span><span class="operator">)].</span>

</code></pre></td></tr></tbody></table></div>