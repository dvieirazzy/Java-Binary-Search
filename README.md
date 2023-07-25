Sendo um famoso algoritmo de busca, a busca binária é um método de busca eficiente para encontrar um elemento específico em uma lista ordenada. Ele segue os seguintes passos:

- A função binarySearch() recebe 2 argumentos, uma lista ordenada e o elemento que você deseja encontrar nessa lista.

- O algoritmo começa calculando o índice do elemento do meio da lista, mesmo que o número de elementos seja par, onde o número será arredondado para baixo.

- Assim o elemento buscado é comparado com o elemento do meio da lista. Existem três cenários possíveis:

  - Elemento central == Elemento buscado: a busca é bem-sucedida, e o algoritmo retorna o índice do elemento encontrado.

  - Elemento central > Elemento buscado: o algoritmo descarta a metade direita da lista, pois o elemento buscado só pode estar na metade esquerda.

  - Elemento central < Elemento buscado: o algoritmo descarta a metade esquerda da lista, pois o elemento buscado só pode estar na metade direita.

Esse processo é repetido até que o elemento seja encontrado ou até que a lista seja reduzida a uma quantidade mínima de elementos.

Se o elemento não for encontrado após a busca, o algoritmo retorna -1 ou outro valor indicando que o elemento não existe na lista.

A busca binária é altamente eficiente, pois a cada iteração, a lista de busca é reduzida pela metade, resultando em um tempo de busca de O(log n), onde n é o número de elementos na lista ordenada. Isso é muito mais rápido do que uma busca linear, que tem tempo de busca de O(n) em listas não ordenadas. No entanto, a busca binária exige que a lista esteja ordenada antes de executar o algoritmo.
