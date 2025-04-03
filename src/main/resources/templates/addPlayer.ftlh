[#ftl]
[@l.page title=" - přidat hráče"]
    <h1>Přidej hráče do turnaje</h1>
    <form class="form" method="post" action="/addPlayer">
        <div class="form__inputBox">
            <label class="form__label" for="playerId">ID *</label>
            <input type="number" name="playerId" required>

        </div>
        <div class="form__inputBox">
            <label class="form__label" for="name">Jméno hráče *</label>
            <input type="text" name="name" required>
        </div>
        <div class="form__inputBox">
            <label class="form__label" for="birthday">Datum narození *</label>
            <input type="date" name="birthday" required>
        </div>
        <div class="button-container">
            <button class="button" type="submit">Přidat hráče</button>
        </div>
    </form>
    <div class="button-container">
        <a href="/">
            <button class="button">Turnaj</button>
        </a>
        <a href="playersList">
            <button class="button">Seznam hráčů</button>
        </a>
    </div>
[/@l.page]