# 1. Two Sum (Duas Soma)

**Dificuldade:** 🟢 Fácil  
**Link:** [Two Sum no LeetCode](https://leetcode.com/problems/two-sum/)

## 📝 Descrição do Problema
Dado um array de inteiros `nums` e um número inteiro `target`, retorne os *índices* dos dois números de forma que eles se somem ao `target`.

Você pode assumir que cada entrada teria **exatamente uma solução**, e você não pode usar o mesmo elemento duas vezes. A resposta pode ser retornada em qualquer ordem.

## 💡 Raciocínio e Soluções

### 1. Força Bruta (Abordagem Inicial)
A maneira mais intuitiva é usar dois laços de repetição aninhados para testar todas as combinações possíveis de pares de números no array até encontrar a soma correta.
* **Prós:** Fácil de implementar.
* **Contras:** Muito ineficiente para arrays grandes.

### 2. Otimização com HashMap (Solução Final)
Para reduzir o tempo de execução, podemos usar a estrutura de dados `HashMap` para "lembrar" dos números que já visitamos. 

Enquanto percorremos o array apenas uma vez, calculamos o **complemento** necessário para atingir o `target` (ou seja, `target - numero_atual`). Em seguida, verificamos se esse complemento já está no nosso `HashMap`. 
* Se estiver, encontramos o par! 
* Se não estiver, salvamos o número atual e seu respectivo índice no mapa e continuamos para o próximo número.

## ⏱️ Complexidade
* **Tempo:** $O(n)$ — Percorremos a lista contendo $n$ elementos apenas uma vez. A busca no HashMap leva, em média, um tempo constante $O(1)$.
* **Espaço:** $O(n)$ — No pior dos casos, o array inteiro (menos um elemento) precisará ser armazenado no HashMap.
