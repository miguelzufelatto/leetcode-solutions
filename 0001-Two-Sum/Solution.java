import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Inicializamos o nosso mapa para guardar os números e seus índices
        Map<Integer, Integer> mapa = new HashMap<>();

        // Usamos apenas um laço de repetição
        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];

            // Verificamos se o complemento já passou por nós
            if (mapa.containsKey(complemento)) {
                return new int[]{mapa.get(complemento), i};
            }

            // Se não passou, guardamos o número atual no mapa e continuamos
            mapa.put(nums[i], i);
        }

        // Retorno de segurança caso nenhum par seja encontrado
        return null;
    }
}