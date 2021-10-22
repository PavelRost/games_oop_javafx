package ru.job4j.chess.firuges.black;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void CreateWithPositionC8() {
        Figure instance = new BishopBlack(Cell.C8);
        assertEquals(Cell.C8, instance.position());
    }

    @Test
    public void whenCopyFigureOnA1ThenPositionA1() {
        Figure instance = new BishopBlack(Cell.H8);
        Figure instanceNew = instance.copy(Cell.A1);
        assertEquals(Cell.A1, instanceNew.position());
    }

    @Test
    public void whenWayIsDiagonal() {
        Figure instance = new BishopBlack(Cell.A1);
        Cell[] result = instance.way(Cell.C3);
        Cell[] expected = {Cell.B2, Cell.C3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWayNoDiagonalThenException() {
        Figure instance = new BishopBlack(Cell.A1);
        instance.way(Cell.D1);
    }

}