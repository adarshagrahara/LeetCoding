defmodule Solution do
  @spec count_bits(n :: integer) :: [integer]
  def count_bits(n) do
        for i <- 0..n, do: i |>
                           Integer.digits(2) |> Enum.sum()
  end
end